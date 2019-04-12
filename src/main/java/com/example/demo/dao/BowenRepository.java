package com.example.demo.dao;

import com.example.demo.model.Bowen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface BowenRepository extends JpaSpecificationExecutor<Bowen>, JpaRepository<Bowen,Integer> {
    /**
     * 查询全部
     * @return
     */
    @Query(nativeQuery=true,value = "select * from bowen order by create_time desc")
    List<Bowen> findAll();

    @Query(nativeQuery=true,value = "select * from bowen where id=?1")
    Bowen findById(Integer id);

    @Modifying
    @Query(nativeQuery=true,value = "update bowen set liulan=liulan+1  where id=?1")
    void updateByLiuLan(Integer id);

    @Modifying
    @Query(nativeQuery=true,value = "update bowen set dianzan=dianzan+1  where id=?1")
    void updateByDianzan(Integer id);

    @Modifying
    @Query(nativeQuery=true,value = "update bowen set liulan=liulan-1  where id=?1")
    void updateByLiuLanfu(Integer id);

}
