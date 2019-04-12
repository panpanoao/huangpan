package com.example.demo.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Cacheable
@Table(name = "score")
public  class Score implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;

    @Column(name="pid")
    private Integer pid;

    @Column(name="testscore_id")
   private String testscoreId;

    @Column(name="pname")
    private String pname;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="scoredate")
    private String scoredate;

/*
    private Integer yyyy;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTestscoreId() {
        return testscoreId;
    }

    public void setTestscoreId(String testscoreId) {
        this.testscoreId = testscoreId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getScoredate() {
        return scoredate;
    }

    public void setScoredate(String scoredate) {
        this.scoredate = scoredate;
    }

    public Score(){}

/*    public Integer getYyyy() {
        return yyyy;
    }

    public void setYyyy(Integer yyyy) {
        this.yyyy = yyyy;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return Objects.equals(id, score.id) &&
                Objects.equals(pid, score.pid) &&
                Objects.equals(testscoreId, score.testscoreId) &&
                Objects.equals(pname, score.pname) &&
                Objects.equals(scoredate, score.scoredate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, testscoreId, pname, scoredate);
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", pid=" + pid +
                ", testscoreId='" + testscoreId + '\'' +
                ", pname='" + pname + '\'' +
                ", scoredate='" + scoredate + '\'' +
                '}';
    }

    public Score(Integer pid, String testscoreId, String pname, String scoredate) {
        this.pid = pid;
        this.testscoreId = testscoreId;
        this.pname = pname;
        this.scoredate = scoredate;
    }
}
