package com.bdd.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.domain.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    
	Optional<MemberEntity> findById(String userId);
	List<MemberEntity> findByid(String id);
}