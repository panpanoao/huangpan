package com.example.demo.web;

import com.example.demo.Util.GetSMS;
import com.example.demo.Util.Md5;
import com.example.demo.dao.UsersRepository;
import com.example.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

/*    *//**
     * 初始化时间组件
     * @param request
     * @param binder
     *//*
    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }*/
    /**
     * 登陆页面
     * @return
     */
    @RequestMapping("denglu")
    public ModelAndView aa(){
        ModelAndView a=new ModelAndView();
        a.setViewName("/denglu");
        return a;
        
    }

    /**
     * 登陆验证
     * @param userName
     * @param password
     * @param
     * @return
     */
    @RequestMapping("denglu.html")
    public ModelAndView login(String userName, String password,HttpSession session){
        ModelAndView result = new ModelAndView();
        Users login=usersRepository.findByUserNameAAndPassword(userName,Md5.MD5(password));
        if(login!=null){
            ServletContext application = session.getServletContext();
            application.setAttribute("login",login);
            result.setViewName("redirect:/indexfirst.html");
        }else{
            String msg = "* 请输入正确的账号和密码!";
            //登录失败--回调信息
            result.setViewName("/denglu");
            result.addObject("msg", msg);
        }
        return result;
    }


    /**
     * 发送短信
     * @param userName
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "duanxin.json",produces="application/json",method = RequestMethod.POST)
    public Integer duanxin(String userName,HttpSession session){
       Users users=usersRepository.findByPhone(userName);
          if(users==null){
            return 1;
        }else{
              GetSMS.getmMssage(users.getPhone());
              String result =GetSMS.randNum;
              session.setAttribute("duanxin",result);
         /*     System.err.println(users.getPhone());*/
              return 2;
        }
    }
    /**
     * 重置密码
     * @param userName
     * @param password
     * @param code
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("reset.json")
    public Integer reset(String userName ,String password,String code,HttpSession session){
        Users users=usersRepository.findByPhone(userName);
        String duanxin=(String) session.getAttribute("duanxin");
        if(code.equals(duanxin)){
                users.setPassword(Md5.MD5(password));
                usersRepository.save(users);
                return 2;
        }else{
            return 1;
        }
    }

    /**
     * 注册
     * @param userName
     * @param password
     * @param phone
     * @return
     */
    @ResponseBody
    @RequestMapping("zhuce.json")
    public Integer zhuce(String userName , String password, String phone){
      Users users=usersRepository.findByPhone(phone);
     if(users==null){
         Users users1=new Users();
         users1.setPassword(Md5.MD5(password));
         users1.setCreateTime(new Date());
         users1.setPhone(phone);
         users1.setUserName(userName);
         usersRepository.save(users1);
         return 2;
     }else{
         return 1;
     }
    }
}
