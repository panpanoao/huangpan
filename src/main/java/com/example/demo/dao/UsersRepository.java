package com.example.demo.dao;

import com.example.demo.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface UsersRepository extends JpaSpecificationExecutor<Users>, JpaRepository<Users,Integer> {
    /**
     * login
     * @param userName
     * @param passwordd
     * @return
     */
    @Query(nativeQuery=true,value = "select * from users where user_name=?1 and password=?2")
    Users findByUserNameAAndPassword(String userName,String passwordd);
/*
    @Query(nativeQuery=true,value = "select * from users where user_name=?1 or phone=?1 ")
    List<Users> findByUserName(String userName);*/

    @Query(nativeQuery=true,value = "select * from users where  phone=?1 ")
    Users findByPhone(String phone);
}
