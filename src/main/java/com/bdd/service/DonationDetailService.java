package com.bdd.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.domain.entity.board.Benefit;
import com.bdd.domain.entity.board.DonationDetail;
import com.bdd.domain.entity.board.DonationDetailRepository;
import com.bdd.dto.board.DonationDetailRequestDto;
import com.bdd.dto.board.DonationDetailResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DonationDetailService {
	@Autowired
	private final DonationDetailRepository donationDetailRepository;
	
	@Transactional
	public void save(DonationDetailRequestDto requestDto) {
		System.out.println("aaaaaaaaaaaaaaaaaaa되라");
		//
		donationDetailRepository.save(requestDto.toEntity()).getDonation_idx();
		System.out.println("bbbbbbbbbbbbbbbb");
	}
	@Transactional
	public List<DonationDetailResponseDto> findAll(){
		List<DonationDetail> entityList = donationDetailRepository.findAll();
		List<DonationDetailResponseDto> donationdetailList = new ArrayList<DonationDetailResponseDto>();
		
		for(int i=0; i<entityList.size();i++) {
			donationdetailList.add(new DonationDetailResponseDto(entityList.get(i)));
		}
		return donationdetailList;
	}	
	
	@Transactional
	public List<DonationDetail> selectDonationDetail(String donor_uid) throws Exception{
		List<DonationDetail> result = donationDetailRepository.findBydonorUid(donor_uid);
		System.out.println(result);
		return result;
		
	}
}
