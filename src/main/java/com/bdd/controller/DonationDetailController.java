package com.bdd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.dto.board.DonationDetailRequestDto;
import com.bdd.dto.board.DonationDetailResponseDto;
import com.bdd.service.DonationDetailService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DonationDetailController {
	private final DonationDetailService donationDetailService;
	
	@GetMapping("/d_detaillist")
	public List<DonationDetailResponseDto> getDonationDetailList(){
		return donationDetailService.findAll();
	}
	@PostMapping("/d_detail")
	public Long reqDonationDetail(@RequestBody DonationDetailRequestDto requestDto) {
		return donationDetailService.save(requestDto);
	}
	@PostMapping("/d_detaillist")
	public List<Long> reqDetailDonationList(@RequestBody List<DonationDetailRequestDto> requestDtos){
		DonationDetailRequestDto requestDto;
		List<Long> donationDetailList= new ArrayList<Long>();
		
		for(int i=0; i<requestDtos.size();i++) {
			requestDto = requestDtos.get(i);
			donationDetailList.add(donationDetailService.save(requestDto));
		}
		return donationDetailList;
	}
	
}
