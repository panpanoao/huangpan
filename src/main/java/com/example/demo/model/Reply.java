package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reply")
public class Reply {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;
    @Column(name="userid")
    private Integer userid;
   @Column(name="user_name")
   private String userName;
    @Column(name="reply_time")
   private Date replyTime;
    @Column(name="reply_text")
    private String  replyText;
    @Column(name="wordsid")
    private int wordsid;
    @Column(name="words_name")
    private String wordsName;
    @Column(name="wordsfkid")
    private Integer wordsfkid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getWordsfkid() {
        return wordsfkid;
    }

    public void setWordsfkid(Integer wordsfkid) {
        this.wordsfkid = wordsfkid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public int getWordsid() {
        return wordsid;
    }

    public void setWordsid(int wordsid) {
        this.wordsid = wordsid;
    }

    public String getWordsName() {
        return wordsName;
    }

    public void setWordsName(String wordsName) {
        this.wordsName = wordsName;
    }

}
