package com.bdd.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bdd.domain.entity.board.DonationDetail;
import com.bdd.domain.entity.board.DonationDetailRepository;
import com.bdd.dto.board.DonationDetailRequestDto;
import com.bdd.dto.board.DonationDetailResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DonationDetailService {
	private final DonationDetailRepository donationDetailRepository;
	
	@Transactional
	public Long save(DonationDetailRequestDto requestDto) {
		return donationDetailRepository.save(requestDto.toEntity()).getStory_idx();
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
	
}
