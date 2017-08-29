package com.aws.mytwitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.mytwitter.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, String> {

}
