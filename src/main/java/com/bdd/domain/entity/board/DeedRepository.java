package com.bdd.domain.entity.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeedRepository extends JpaRepository<Deed, Integer> {
	List<Deed> findByid(String id);
}
