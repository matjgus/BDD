package com.bdd.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bdd.domain.entity.board.DonationDetail;
import com.bdd.domain.entity.board.DonationDetailRepository;
import com.bdd.domain.entity.board.StoryInfo;
import com.bdd.domain.entity.board.StoryInfoRepository;
import com.bdd.dto.board.DonationDetailRequestDto;
import com.bdd.dto.board.DonationDetailResponseDto;
import com.bdd.dto.board.StoryInfoResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DonationDetailService {
	@Autowired
	private final DonationDetailRepository donationDetailRepository;
	private final StoryInfoRepository storyInfoRepository;
	
	
	@Transactional
	public void save(DonationDetailRequestDto requestDto) {
		System.out.println("aaaaaaaaaaaaaaaaaaa되라");
		//
		donationDetailRepository.save(requestDto.toEntity()).getDonationIdx();
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
	public List<DonationDetail> selectDonationDetail(String donorUid) throws Exception{
		List<DonationDetail> result = donationDetailRepository.findBydonorUid(donorUid);
		System.out.println(result);
		return result;
		
	}
	
	@Transactional()
	public HashMap<String, Object> findAll(Integer page, Integer size) {
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		Page<StoryInfo> list = storyInfoRepository.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "registerTime")));
		resultMap.put("list", list.stream().map(StoryInfoResponseDto::new).collect(Collectors.toList()));
		resultMap.put("paging", list.getPageable());
		resultMap.put("totalCnt", list.getTotalElements());
		resultMap.put("totalPage", list.getTotalPages());
		
		return resultMap;
	}
}