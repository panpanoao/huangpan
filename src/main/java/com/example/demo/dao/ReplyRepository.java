package com.example.demo.dao;

import com.example.demo.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface ReplyRepository extends JpaSpecificationExecutor<Reply>, JpaRepository<Reply,Integer> {

    @Query(nativeQuery=true,value = "select * from reply where wordsid=?1 order by reply_time desc")
    List<Reply> findBywordsid(int wordsid);

    @Modifying
    @Query(nativeQuery=true,value = "delete from reply  where wordsfkid=?1")
    void deletereplyByBowenId(Integer id);
}
