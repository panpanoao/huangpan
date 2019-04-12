package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="album")
public class Album {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;
    @Column(name = "album_title")
    private String albumTitle;
    @Column(name="album_mintitle")
    private String albumMintitle;
    @Column(name="cover_map")
    private String coverMap;
    @Column(name="album_time")
    private Date albumTime;
    @Column(name="album_text")
    private String albumText;
    @Column(name="cover_maplist")
    private String coverMaplist;
    @Column(name="dianzan")
    private int dianzan;
    @Column(name="liulan")
    private int liulan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumMintitle() {
        return albumMintitle;
    }

    public void setAlbumMintitle(String albumMintitle) {
        this.albumMintitle = albumMintitle;
    }

    public String getCoverMap() {
        return coverMap;
    }

    public void setCoverMap(String coverMap) {
        this.coverMap = coverMap;
    }

    public Date getAlbumTime() {
        return albumTime;
    }

    public void setAlbumTime(Date albumTime) {
        this.albumTime = albumTime;
    }

    public String getAlbumText() {
        return albumText;
    }

    public void setAlbumText(String albumText) {
        this.albumText = albumText;
    }

    public String getCoverMaplist() {
        return coverMaplist;
    }

    public void setCoverMaplist(String coverMaplist) {
        this.coverMaplist = coverMaplist;
    }

    public int getDianzan() {
        return dianzan;
    }

    public void setDianzan(int dianzan) {
        this.dianzan = dianzan;
    }

    public int getLiulan() {
        return liulan;
    }

    public void setLiulan(int liulan) {
        this.liulan = liulan;
    }
}
