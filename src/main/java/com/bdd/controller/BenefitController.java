package com.bdd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.domain.entity.board.Benefit;
import com.bdd.dto.board.BenefitRequestDto;
import com.bdd.dto.board.BenefitResponseDto;
import com.bdd.service.BenefitService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BenefitController {
	private final BenefitService benefitService;
	
	@GetMapping("/benefitlist")
	public List<BenefitResponseDto> getbenefitList(){
		return benefitService.findAll();
	}
	@PostMapping("/benefit")
	public Integer reqBenefit(@RequestBody BenefitRequestDto requestDto) {
		return benefitService.save(requestDto);
	}
	
	@PostMapping("/benefitlist")
	public List<Integer> reqDeedList(@RequestBody List<BenefitRequestDto> requestDtos){
		BenefitRequestDto requestDto;
		List<Integer> deedList = new ArrayList<Integer>();
		
		for(int i=0; i<requestDtos.size();i++) {
			requestDto = requestDtos.get(i);
			deedList.add(benefitService.save(requestDto));
		}
		return deedList;
	}
	
	//list던지기
	@GetMapping("/benefitdetail")
	public List<Benefit> findBenefitByid() throws Exception{
		return benefitService.selectBenefitList("마서현");
	}
	
	/*
	@GetMapping("/benefitdetail")
	public List<Benefit> findBenefitByid(@RequestParam(value="id") String id) throws Exception{
		return benefitService.selectBenefitDetail(id);
	}
	*/
}
