package com.se7en.repository;

import com.se7en.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author se7en
 * @Date 10/25 0025 22:26
 * @VERSION 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
