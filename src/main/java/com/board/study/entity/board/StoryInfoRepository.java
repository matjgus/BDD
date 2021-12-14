package com.board.study.entity.board;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryInfoRepository extends JpaRepository<StoryInfo, Long>{
	Optional<StoryInfo> findByName(String name);
	void deleteByName(String name);
}