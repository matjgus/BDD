package com.board.study.entity.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.board.study.dto.board.BoardRequestDto;

public interface BoardRepository extends JpaRepository<Board, Long> {
	
	String UPDATE_BOARD = "update board "
			+ "set title = :#{#boardRequestDto.title}, "
			+ "content = :#{#boardRequestDto.content}, "
			+ "update_time = NOW() "
			+ "where id = :#{#boardRequestDto.id}";
	
	@Transactional
	@Modifying
	@Query(value = UPDATE_BOARD, nativeQuery = true)
	public int updateBoard(@Param("boardRequestDto") BoardRequestDto boardRequestDto);
}
