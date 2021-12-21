package com.bdd.domain.entity.board;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitRepository extends JpaRepository<Benefit, Integer> {
	List<Benefit> findByid(String id);

	Optional<Benefit> findById(String id);
}
