package com.example.demo.dao;

import com.example.demo.model.Bowen;
import com.example.demo.model.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface WordsRepository extends JpaSpecificationExecutor<Words>, JpaRepository<Words,Integer> {

    @Query(nativeQuery=true,value = "select * from words where bowenid=?1 order by words_time desc")
    List<Words> findBybowenid(int id);

    @Query(nativeQuery=true,value = "select * from words where albumid=?1 order by album_time desc")
    List<Words> findByalbumid(int id);
}
