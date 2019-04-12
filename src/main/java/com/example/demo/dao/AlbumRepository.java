package com.example.demo.dao;

import com.example.demo.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface AlbumRepository extends JpaSpecificationExecutor<Album>, JpaRepository<Album,Integer> {

    @Query(nativeQuery=true,value = "select * from album where id=?1")
    Album findById(Integer id);

    @Modifying
    @Query(nativeQuery=true,value = "update album set liulan=liulan+1  where id=?1")
    void updateByLiuLan(Integer id);

    @Modifying
    @Query(nativeQuery=true,value = "update album set dianzan=dianzan+1  where id=?1")
    void updateByDianzan(Integer id);

    @Modifying
    @Query(nativeQuery=true,value = "update album set liulan=liulan-1  where id=?1")
    void updateByLiuLanfu(Integer id);


}
