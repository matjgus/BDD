package com.bdd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bdd.domain.entity.board.Deed;
import com.bdd.domain.entity.board.DeedRepository;
import com.bdd.dto.board.DeedRequestDto;
import com.bdd.dto.board.DeedResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeedService {
	private final DeedRepository deedRepository;
	
	@Transactional
	public int save(DeedRequestDto requestDto) {
		return deedRepository.save(requestDto.toEntity()).getDeed_idx();
	}
	
	//------------------------------------
	@Transactional
	public List<Deed> selectDeedDetail(String id) throws Exception{
		List<Deed> result = deedRepository.findByid(id);
        //System.out.println("서비스서비스1=================================");
        //System.out.println("서비스서비스2=================================");
		System.out.println(result);

		return result;
	}
	//------------------------------------

	@Transactional
	public List<DeedResponseDto> findAll(){
		List<Deed> entityList = deedRepository.findAll();
		List<DeedResponseDto> deedList = new ArrayList<DeedResponseDto>();
		
		for(int i=0; i<entityList.size(); i++) {
			deedList.add(new DeedResponseDto(entityList.get(i)));
		}
		return deedList;
	}


}
