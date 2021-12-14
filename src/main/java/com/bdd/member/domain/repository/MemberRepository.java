package com.bdd.member.domain.repository;

import com.bdd.member.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    
	Optional<MemberEntity> findById(String userId);
}