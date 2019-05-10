package com.example.demo.service;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.dao.BowenRepository;
import com.example.demo.dao.WordsRepository;
import com.example.demo.dao.ZanRepository;
import com.example.demo.mapper.AlbumMapper;
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
public class AlbumServiceImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private AlbumMapper albumMapper;
    @Autowired
    ZanRepository zanRepository;
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    WordsRepository wordsRepository;


    /**
     * 分页
     * @param page
     * @param rows
     * @return
     */
    public List<Album> findByPage(Integer page, Integer rows){
        try {
            PageHelper.startPage(page,rows);
            return albumMapper.findAll();
        } catch (Exception e) {

            return null;
        }
    }

    /**
     * 点赞相册
     * @param usersid
     * @param albumid
     * @return
     */
    public int findByuseridandalbumid(Integer usersid,Integer albumid){
        Zan zan=zanRepository.findByUseridAndAlbumid(usersid,albumid);
        if(zan!=null){
            return 1;
        }else{
            albumRepository.updateByDianzan(albumid);
            albumRepository.updateByLiuLanfu(albumid);
            Zan zan1=new Zan();
            zan1.setAlbumid(albumid);
            zan1.setUsersid(usersid);
            zan1.setZanTime(new Date());
            zanRepository.save(zan1);

            return 2;
        }
    }


    /**
     * 浏览
     * @param id
     * @return
     */
    public Album findAllByUpdate(Integer id){
       albumRepository.updateByLiuLan(id);
      return  albumRepository.findById(id);
    }


    public int liuyanalbum(Integer userid, String albumText, String userName, Integer albumid) {
        if (userid == null || userid == 0) {
            return 1;
        } else {
            Words words = new Words();
            words.setUserName(userName);
            words.setUsersid(userid);
            words.setAlbumText(albumText);
            words.setAlbumid(albumid);
            words.setAlbumTime(new Date());
            wordsRepository.save(words);
            albumRepository.updateByLiuLanfu(albumid);
            return 2;
        }
    }

}
