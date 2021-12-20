package com.bdd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.domain.entity.MemberEntity;
import com.bdd.domain.repository.MemberRepository;
import com.bdd.dto.MemberDto;
import com.bdd.dto.board.DonationDetailRequestDto;
import com.bdd.dto.board.DonationDetailResponseDto;
import com.bdd.service.DonationDetailService;
import com.bdd.service.MemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DonationDetailController {
	private final DonationDetailService donationDetailService;
	private final MemberService memberService;
	private MemberRepository memberRepository;
	String currentId = null;
	int d_num;
	int d_count;
	
	
	@GetMapping("/d_detaillist")
	public List<DonationDetailResponseDto> getDonationDetailList(){
		return donationDetailService.findAll();
	}
	
	@PostMapping("/d_detail")
	@ResponseBody
	public void reqDonationDetail(@RequestBody DonationDetailRequestDto requestDto) {
		System.out.println("test----------------------------------------");
		System.out.println(requestDto);
		System.out.println(requestDto.getDonor_uid());
		currentId = requestDto.getDonor_uid();
		d_num = requestDto.getDonation_count();
		donationDetailService.save(requestDto);
	}
	
	
	
	
	


	
// @PostMapping("/d_detaillist")
// public List<Long> reqDetailDonationList(@RequestBody List<DonationDetailRequestDto> requestDtos){
// 	DonationDetailRequestDto requestDto;
// 	List<Long> donationDetailList= new ArrayList<Long>();
//	
// 	for(int i=0; i<requestDtos.size();i++) {
// 		requestDto = requestDtos.get(i);
// 		donationDetailList.add(donationDetailService.save(requestDto));
// 	}
// 	return donationDetailList;
// }
	
}
