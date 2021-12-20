package com.bdd.domain.entity.board;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationDetailRepository extends JpaRepository<DonationDetail, Long>{

	

}
