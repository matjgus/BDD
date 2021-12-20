package com.bdd.domain.repository;

import com.bdd.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    
	Optional<MemberEntity> findById(String userId);
	List<MemberEntity> findByid(String Id);
}