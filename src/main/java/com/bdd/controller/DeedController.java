package com.bdd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.domain.entity.board.Deed;
import com.bdd.dto.board.DeedRequestDto;
import com.bdd.dto.board.DeedResponseDto;
import com.bdd.service.DeedService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DeedController {
	private final DeedService deedService;
	
	@GetMapping("/deedlist")
	public List<DeedResponseDto> getDeedList(){
		return deedService.findAll();
	}
	@PostMapping("/deed")
	public Integer reqDeed(@RequestBody DeedRequestDto requestDto) {
		return deedService.save(requestDto);
	}
	@PostMapping("/deedlist")
	public List<Integer> reqDeedList(@RequestBody List<DeedRequestDto> requestDtos){
		DeedRequestDto requestDto;
		List<Integer> deedList = new ArrayList<Integer>();
		
		for(int i=0; i<requestDtos.size();i++) {
			requestDto = requestDtos.get(i);
			deedList.add(deedService.save(requestDto));
		}
		return deedList;
	}
	@GetMapping("/deeddetail")
	public List<Deed> findDeedByid() throws Exception{
        System.out.println("후원증컨트롤러11111=================================");
        System.out.println("후원증컨트롤러22222=================================");
		return deedService.selectDeedDetail("마서현");
		
	}
	
	/*
	@GetMapping("/deeddetail")
	public List<Deed> findDeedByid(@RequestParam(value="id") String id) throws Exception{
		return deedService.selectDeedDetail(id);
	}
	*/
	
}
