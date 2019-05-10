package com.example.demo.dao;

import com.example.demo.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Collection;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface ReplyRepository extends JpaSpecificationExecutor<Reply>, JpaRepository<Reply,Integer> {


    List<Reply> findByWordsfkidInOrderByReplyTimeDesc(List<Integer> wordslist);



    @Modifying
    @Query(nativeQuery=true,value = "delete from reply  where wordsfkid=?1")
    void deletereplyByBowenId(Integer id);

}
