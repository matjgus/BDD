package com.bdd.domain.entity.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bdd.dto.board.BoardRequestDto;

public interface DonationDetailRepository extends JpaRepository<DonationDetail, Long>{
	List<DonationDetail> findBydonorUid(String donorUid);
	
	
	
}