package com.example.demo.dao;

import com.example.demo.model.Bowen;
import com.example.demo.model.Zan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface ZanRepository extends JpaSpecificationExecutor<Zan>, JpaRepository<Zan,Integer> {
    @Query(nativeQuery=true,value = "select * from zan where usersid=?1 and bowenid=?2")
    Zan findByUseridAndBowenid(Integer usersid,Integer bowenid);
    @Query(nativeQuery=true,value = "select * from zan where usersid=?1 and albumid=?2")
    Zan findByUseridAndAlbumid(Integer usersid,Integer albumid);
}
