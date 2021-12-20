package com.bdd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.domain.entity.board.DonationDetail;
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
	@ResponseBody
	public void reqDonationDetail(@RequestBody DonationDetailRequestDto requestDto) {
		System.out.println("test----------------------------------------");
		System.out.println(requestDto);
		donationDetailService.save(requestDto);
	}
	// @PostMapping("/d_detaillist")
	// public List<Long> reqDetailDonationList(@RequestBody List<DonationDetailRequestDto> requestDtos){
	// 	DonationDetailRequestDto requestDto;
	// 	List<Long> donationDetailList= new ArrayList<Long>();
		
	// 	for(int i=0; i<requestDtos.size();i++) {
	// 		requestDto = requestDtos.get(i);
	// 		donationDetailList.add(donationDetailService.save(requestDto));
	// 	}
	// 	return donationDetailList;
	// }
//	
//	@GetMapping("/d_detail_get")
//	public List<DonationDetail> findBydonorUid() throws Exception{
//		System.out.println("어디서 터지노");
//		System.out.println(donationDetailService.selectDonationDetail("rlatpgus4444"));
//		return donationDetailService.selectDonationDetail("rlatpgus4444");
//	}
	@GetMapping("/d_detail_get")
	public List<DonationDetail> findBydonorUid(@RequestParam(value="donorUid") String donorUid) throws Exception{
				return donationDetailService.selectDonationDetail(donorUid);
	}
}
