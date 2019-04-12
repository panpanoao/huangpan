package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="zan")
public class Zan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;

    @Column(name="bowenid")
    private Integer bowenid;

    @Column(name="usersid")
    private Integer usersid;

    @Column(name="zan_time")
    private Date zanTime;

    @Column(name="albumid")
    private Integer albumid;

    @Column(name="album_time")
    private Date albumTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBowenid() {
        return bowenid;
    }

    public void setBowenid(Integer bowenid) {
        this.bowenid = bowenid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Date getZanTime() {
        return zanTime;
    }

    public void setZanTime(Date zanTime) {
        this.zanTime = zanTime;
    }

    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public Date getAlbumTime() {
        return albumTime;
    }

    public void setAlbumTime(Date albumTime) {
        this.albumTime = albumTime;
    }
}
