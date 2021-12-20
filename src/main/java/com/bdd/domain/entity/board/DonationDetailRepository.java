package com.bdd.domain.entity.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationDetailRepository extends JpaRepository<DonationDetail, Long>{
	List<DonationDetail> findBydonorUid(String donorUid);
}