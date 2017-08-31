package com.aws.mytwitter.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.mytwitter.entity.security.Authorities;

@Repository
public interface AuthorityRepository extends JpaRepository<Authorities, Long> {
	


}
