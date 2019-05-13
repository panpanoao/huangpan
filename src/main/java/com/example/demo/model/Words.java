package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "words")
public class Words{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;
    @Column(name="usersid")
    private int usersid;
    @Column(name="user_name")
    private String userName;
    @Column(name="words_time")
    private Date wordsTime;
    @Column(name="words_text")
    private String wordsText;
    @Column(name="bowenid")
    private Integer bowenid;
    @Column(name="albumid")
    private Integer albumid;
    @Column(name="album_text")
    private String albumText;
    @Column(name="album_time")
    private Date albumTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUsersid() {
        return usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getWordsTime() {
        return wordsTime;
    }

    public void setWordsTime(Date wordsTime) {
        this.wordsTime = wordsTime;
    }

    public String getWordsText() {
        return wordsText;
    }

    public void setWordsText(String wordsText) {
        this.wordsText = wordsText;
    }

    public Integer getBowenid() {
        return bowenid;
    }

    public void setBowenid(Integer bowenid) {
        this.bowenid = bowenid;
    }

    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public String getAlbumText() {
        return albumText;
    }

    public void setAlbumText(String albumText) {
        this.albumText = albumText;
    }

    public Date getAlbumTime() {
        return albumTime;
    }

    public void setAlbumTime(Date albumTime) {
        this.albumTime = albumTime;
    }
}
