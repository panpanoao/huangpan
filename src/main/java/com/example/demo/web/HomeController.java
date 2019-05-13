package com.example.demo.web;

import com.example.demo.dao.*;
import com.example.demo.model.*;
import com.example.demo.service.AlbumServiceImpl;
import com.example.demo.service.BowenServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    BowenRepository bowenRepository;
    @Autowired
    WordsRepository wordsRepository;
    @Autowired
    ReplyRepository replyRepository;
    @Autowired
    BowenServiceImpl bowenService;

    @Autowired
    ZanRepository zanRepository;

    @Autowired
    AlbumServiceImpl albumService;

    @Autowired
    AlbumRepository albumRepository;



    /**
     * 登陆成功
     *
     * @return
     */
    @RequestMapping("/indexfirst.html")
    public ModelAndView indexfirst(HttpSession session) {

        ModelAndView result = new ModelAndView();
        Users users=(Users)session.getAttribute("login");
       if(users==null){
           result.setViewName("/denglu");
       }else {
           List<Bowen> bowenList = bowenRepository.findAll();
           result.setViewName("/indexfirst");
           result.addObject("bowenList", bowenList);
       }
        return result;
    }

    /**
     * 博文详情页面
     *
     * @param id
     * @return
     */
    @RequestMapping("/info.html")
    public ModelAndView indexfirsst(@RequestParam(required = false, defaultValue = "1") Integer id,String code) {
        ModelAndView result = new ModelAndView();
          //根据id博文数据
        Bowen bowen = null;
             bowen = bowenService.findById(id);
            result.addObject("bowen", bowen);
            //找到该博文下的所有留言
            List<Words> wordsList = wordsRepository.findBybowenid(id);
            result.addObject("wordsList", wordsList);
          List<Integer> wordsid=new ArrayList<>();
        for (Words words : wordsList) {
            wordsid.add(words.getId());
        }
        List<Reply> replyList=replyRepository.findByWordsfkidInOrderByReplyTimeDesc(wordsid);


        result.addObject("replyList", replyList);
            if(code==null||code==""||code=="null"){
                result.setViewName("/info");
            }else{
                result.setViewName("/infos");
            }
        return result;
        }


    /**
     * 留言
     *
     * @param userid
     * @param wordsText
     * @param
     * @param bowenid
     * @return
     */
    @ResponseBody
    @RequestMapping("/liuyan.json")
    public int liuyan(Integer userid, String wordsText, String userName, Integer bowenid, HttpSession session) {

            return bowenService.liuyan(userid, wordsText, userName, bowenid);

    }

    /**
     * 点赞博文
     *
     * @param usersid
     * @param bowenid
     * @return
     */
    @ResponseBody
    @RequestMapping("/dianzan.json")
    public int dianzan(Integer usersid, Integer bowenid) {
        return bowenService.findByuseridandbowenid(usersid, bowenid);
    }
/*
    @ResponseBody
    @RequestMapping("/huifu")
    public void deletenewById(Integer id, HttpSession session){
        if(id!=null&&id!=0) {
            List<Reply> replies = replyRepository.findBywordsid(id);
            if(replies!=null&&replies.size()>0){
                System.out.println(replies.get(0).getReplyText());
                session .setAttribute("replylist", replies);
            }else{
                session.removeAttribute("replylist");
            }
        }else{
            session.removeAttribute("replylist");
        }
    }*/


    /**
     * 第二个页面
     */

    @RequestMapping("/time.html")
    public ModelAndView findByxian() {
        return new ModelAndView("/time");
    }

/**
 * 第三个页面
 */

    /**
     * 分页
     *
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("list.html")
    public ModelAndView findBuPage(@RequestParam(required = false, defaultValue = "1") Integer page,
                                   @RequestParam(required = false, defaultValue = "6") Integer rows) {
        ModelAndView result = new ModelAndView("/list");
        List<Bowen> bowenList = bowenService.findByPage(page, rows);
        result.addObject("pageInfo", new PageInfo<Bowen>(bowenList));
        PageInfo<Bowen> pageInfo = new PageInfo<Bowen>(bowenList);
  /*   Page<Bowen> lists= bowenService.ccc();

        System.out.println("最小页码"+lists.getFirstpage());
        System.out.println("总数"+lists.getCount());
        System.out.println("最后一页"+lists.getLastpage());
        System.out.println(lists.getnavs());
        System.out.println("数组内容");
        for (int i : lists.getNav()) {
            System.out.println(i);
        }
        for (Bowen bowen : lists.getPageList()) {
            System.out.println(bowen);
        }*/
        return result;
    }


    /**
     * 最后一个页面
     */

    @RequestMapping("/about.html")
    public ModelAndView lasthtml() {
        return new ModelAndView("/about");
    }


//-------------------------我的相册----------------------------------------

    /**
     * 相册分页
     *
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("share.html")
    public ModelAndView findByAlbumPage(@RequestParam(required = false, defaultValue = "1") Integer page,
                                        @RequestParam(required = false, defaultValue = "8") Integer rows) {
        ModelAndView result = new ModelAndView("/share");
        List<Album> albumList = albumService.findByPage(page, rows);
        result.addObject("pageInfo", new PageInfo<Album>(albumList));
        return result;
    }




    //---------视频----------------
    @RequestMapping("infopic.html")
    public ModelAndView findByalbumId(@RequestParam(required = false, defaultValue = "1") Integer id,String type) {

        ModelAndView result = new ModelAndView();
        Album album = albumService.findAllByUpdate(id);
        List<Words> wordsList = wordsRepository.findByalbumid(id);

        List<Integer> wordsid=new ArrayList<>();
        for (Words words : wordsList) {
            wordsid.add(words.getId());
        }
        List<Reply> replyList=replyRepository.findByWordsfkidInOrderByReplyTimeDesc(wordsid);


        result.addObject("replyList", replyList);

        String[] imglist = album.getCoverMaplist().split(",");
        result.addObject("imglist", imglist);
        result.addObject("size", imglist.length);
        result.addObject("album", album);
        result.addObject("wordsList", wordsList);
        if(type==null||type=="" ||type=="null"){
            result.setViewName("/infopics");
        }else{
            result.setViewName("/infopic");
        }
        return result;
    }

    /**
     * 点赞相册
     *
     * @param usersid
     * @param albumid
     * @return
     */
    @ResponseBody
    @RequestMapping("dianzanalbum.json")
    public int dianzanalbum(Integer usersid, Integer albumid) {
        return albumService.findByuseridandalbumid(usersid, albumid);
    }

    /**
     * 相册留言
     *
     * @param userid
     * @param albumText
     * @param
     * @param albumid
     * @return
     */
    @ResponseBody
    @RequestMapping("/liuyanalbum.json")
    public int liuyanalbum(Integer userid, String albumText,String userName, Integer albumid) {
      return  albumService.liuyanalbum(userid,albumText,userName,albumid);
    }

    /**
     * 删除博文id对应留言
     * @param wordsid
     * @return
     */
    @ResponseBody
    @RequestMapping("/deletewords.json")
    public int deleteLiuyan(Integer wordsid){
        if(wordsid!=0||wordsid!=null){
            bowenService.deleteByBowenId(wordsid);
            return 1;
        }else{
            return 2;
        }
    }
    @ResponseBody
    @RequestMapping("/lyhuifu.json")
    public int lyhuifu(Integer wordsfkid,String userName,Integer userid,String reply_text,Integer bowenid ,HttpSession session){
     return bowenService.lyhuifu( wordsfkid, userName,userid, reply_text,bowenid,session);
    }

    @ResponseBody
    @RequestMapping("/lyhuifualbum.json")
    public int lyhuifualbum(Integer wordsfkid,String userName,Integer userid,String reply_text,Integer albumid ,HttpSession session){
        return bowenService.lyhuifualbum( wordsfkid, userName,userid, reply_text,albumid,session);
    }

}