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
		return benefitService.selectBenefitList("sa01578");
	}
	
	//페이지 들어갔을 때 전체 리스트 리턴
	@GetMapping("/allbenefitlist")
	public List<Benefit> getBenefitList(BenefitRequestDto requestDto) throws Exception {
		return benefitService.selectBenefitList(requestDto.getId());
	}
	
	//타입은 상관없고 db로 업데이트
	@PostMapping("/checkbenefit")
	public void checkbenefit(@RequestBody BenefitRequestDto requestDto) {
		benefitService.updateBenefitB10(requestDto.getId(), requestDto.getIs_get10());
		benefitService.updateBenefitB20(requestDto.getId(), requestDto.getIs_get20());
		benefitService.updateBenefitB30(requestDto.getId(), requestDto.getIs_get30());
	}
	
	
	/*
	@GetMapping("/benefitdetail")
	public List<Benefit> findBenefitByid(@RequestParam(value="id") String id) throws Exception{
		return benefitService.selectBenefitDetail(id);
	}
	*/
}
