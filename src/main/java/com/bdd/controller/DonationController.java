package com.bdd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.dto.board.DonationRequestDto;
import com.bdd.dto.board.DonationResponseDto;
import com.bdd.service.DonationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DonationController {
	private final DonationService donationService;
	
	@GetMapping("/donationlist")
	public List<DonationResponseDto> getDonationList(){
		return donationService.findAll();
	}
	@PostMapping("/donation")
	public Long reqDonation(@RequestBody DonationRequestDto requestDto) {
		return donationService.save(requestDto);
	}
	@PostMapping("/donationlist")
	public List<Long> reqDonationList(@RequestBody List<DonationRequestDto> requestDtos){
		DonationRequestDto requestDto;
		List<Long> donationList = new ArrayList<Long>();
		
		for(int i=0;i<requestDtos.size();i++) {
			requestDto = requestDtos.get(i);
			donationList.add(donationService.save(requestDto));
		}
		return donationList;
	}
	@DeleteMapping("/donation")
	public Long deleteDonationById(Long donationList) {
		return donationService.deleteById(donationList);
	}
}
