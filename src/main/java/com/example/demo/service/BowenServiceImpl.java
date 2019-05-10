package com.example.demo.service;

import com.example.demo.dao.BowenRepository;
import com.example.demo.dao.ReplyRepository;
import com.example.demo.dao.WordsRepository;
import com.example.demo.dao.ZanRepository;
import com.example.demo.mapper.BowenMapper;
import com.example.demo.model.*;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BowenServiceImpl {

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    BowenRepository bowenRepository;

    @Autowired
    ZanRepository zanRepository;

    @Autowired
    WordsRepository wordsRepository;

    @Autowired
    ReplyRepository  replyRepository;

    @Autowired
    BowenMapper bowenMapper;

    /**
     * 修改浏览量之后进行查询
     * @param id
     * @return
     */
   public Bowen findById(Integer id){
    bowenRepository.updateByLiuLan(id);
    return  bowenRepository.findById(id);
}

    /**
     * 点赞
     * @param usersid
     * @param bowenid
     * @return
     */
    public int findByuseridandbowenid(Integer usersid,Integer bowenid){
       Zan zan=zanRepository.findByUseridAndBowenid(usersid,bowenid);
       if(zan!=null){
           return 1;
       }else{
           //点赞加1
           bowenRepository.updateByDianzan(bowenid);
           //浏览点赞还是当前浏览数
           bowenRepository.updateByLiuLanfu(bowenid);
           Zan zan1=new Zan();
           zan1.setBowenid(bowenid);
           zan1.setUsersid(usersid);
           zan1.setZanTime(new Date());
           zanRepository.save(zan1);
           return 2;
       }
    }


    /**
     * 分页
     * @param page
     * @param rows
     * @return
     */
    public List<Bowen> findByPage(Integer page,Integer rows){
        try {
            PageHelper.startPage(page,rows);
            return bowenMapper.findAll();
        } catch (Exception e) {

            return null;
        }
}


    public int liuyan(Integer userid, String wordsText, String userName, Integer bowenid) {

            Words words = new Words();
            words.setUsersid(userid);
            words.setUserName(userName);
            words.setWordsText(wordsText);
            words.setBowenid(bowenid);
            words.setWordsTime(new Date());
            wordsRepository.save(words);
            bowenRepository.updateByLiuLanfu(bowenid);
            return 2;

    }


    public void deleteByBowenId(Integer wordsId){
        try{
        replyRepository.deletereplyByBowenId(wordsId);
        wordsRepository.delete(wordsId);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e);
        }
    }

    public int lyhuifu(Integer wordsfkid,String userName,Integer userid,String reply_text,Integer bowenid,HttpSession session){
        Users users=(Users)session.getAttribute("login");
        if(users!=null) {
            Reply reply = new Reply();
            reply.setReplyText(reply_text);
            reply.setUserid(userid);
            reply.setUserName(userName);
            reply.setReplyTime(new Date());
            reply.setWordsid(users.getId());
            reply.setWordsName(users.getUserName());
            reply.setWordsfkid(wordsfkid);
            bowenRepository.updateByLiuLanfu(bowenid);
            replyRepository.save(reply);
            return 2;
        }else{
            return 1;
        }
    }

    /**
     * 手动封装的分页类
     * @return
     */
     public Page<Bowen> ccc(){
    return new Page<Bowen>(bowenRepository.findAll(),1,5);
}
}
