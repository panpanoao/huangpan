package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bowen")
public class Bowen {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;
    @Column(name="create_time")
    private Date createTime;
    @Column(name="bowen_title")
    private String bowenTitle;
    @Column(name="bowen_mintitle")
    private String bowenMintitle;
    @Column(name="bowen_text")
    private String bowenText;
    @Column(name="dianzan")
    private int dianzan;
    @Column(name="liulan")
    private int liulan;

    @Column(name="bowen_map")
    private String bowenMap;

    @Override
    public String toString() {
        return "Bowen{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", bowenTitle='" + bowenTitle + '\'' +
                ", bowenMintitle='" + bowenMintitle + '\'' +
                ", bowenText='" + bowenText + '\'' +
                ", dianzan=" + dianzan +
                ", liulan=" + liulan +
                ", bowenMap='" + bowenMap + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBowenTitle() {
        return bowenTitle;
    }

    public void setBowenTitle(String bowenTitle) {
        this.bowenTitle = bowenTitle;
    }

    public String getBowenMintitle() {
        return bowenMintitle;
    }

    public void setBowenMintitle(String bowenMintitle) {
        this.bowenMintitle = bowenMintitle;
    }

    public String getBowenText() {
        return bowenText;
    }

    public void setBowenText(String bowenText) {
        this.bowenText = bowenText;
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

    public String getBowenMap() {
        return bowenMap;
    }

    public void setBowenMap(String bowenMap) {
        this.bowenMap = bowenMap;
    }
}
