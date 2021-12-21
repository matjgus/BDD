package com.bdd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bdd.domain.entity.MemberEntity;
import com.bdd.domain.entity.board.Benefit;
import com.bdd.domain.entity.board.BenefitRepository;
import com.bdd.domain.entity.board.StoryInfo;
import com.bdd.dto.board.BenefitRequestDto;
import com.bdd.dto.board.BenefitResponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BenefitService {
	private final BenefitRepository benefitRepository;
	
	@Transactional
	public int save(BenefitRequestDto requestDto) {
		return benefitRepository.save(requestDto.toEntity()).getUid();
	}
	@Transactional
	public List<BenefitResponseDto> findAll(){
		List<Benefit> entityList = benefitRepository.findAll();
		List<BenefitResponseDto> benefitList = new ArrayList<BenefitResponseDto>();
		
		for(int i=0; i<entityList.size(); i++) {
			benefitList.add(new BenefitResponseDto(entityList.get(i)));
		}
		return benefitList;
	}
	
	//추가
	public List<Benefit> selectBenefitList(String id) throws Exception{
		List<Benefit> result = benefitRepository.findByid(id);
		
		System.out.println(result);
		return result;
	}
	@Transactional
	public void updateBenefitB10(String id, char b10) {
		Optional<Benefit> benefit = benefitRepository.findById(id);
		Benefit updateBenefit = benefit.get();
		updateBenefit.setIs_get10(b10);
	}
	@Transactional
	public void updateBenefitB20(String id, char b20) {
		Optional<Benefit> benefit = benefitRepository.findById(id);
		Benefit updateBenefit = benefit.get();
		updateBenefit.setIs_get20(b20);
	}
	@Transactional
	public void updateBenefitB30(String id, char b30) {
		Optional<Benefit> benefit = benefitRepository.findById(id);
		Benefit updateBenefit = benefit.get();
		updateBenefit.setIs_get30(b30);
		System.out.println("23");
	}
}
