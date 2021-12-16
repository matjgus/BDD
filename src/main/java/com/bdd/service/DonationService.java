package com.bdd.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bdd.domain.entity.board.Donation;
import com.bdd.domain.entity.board.DonationRepository;
import com.bdd.dto.board.DonationRequestDto;
import com.bdd.dto.board.DonationResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DonationService {
	private final DonationRepository donationRepository;
	
	@Transactional
	public Long save(DonationRequestDto requestDto) {
		return donationRepository.save(requestDto.toEntity()).getStory_idx();
	}
	@Transactional
	public List<DonationResponseDto> findAll(){
		List<Donation> entityList = donationRepository.findAll();
		List<DonationResponseDto> donationList = new ArrayList<DonationResponseDto>();
		
		for(int i=0; i<entityList.size();i++) {
			donationList.add(new DonationResponseDto(entityList.get(i)));
		}
		return donationList;
	}
	@Transactional
	public Long deleteById(Long story_idx) {
		donationRepository.deleteById(story_idx);
		return story_idx;
	}
}
