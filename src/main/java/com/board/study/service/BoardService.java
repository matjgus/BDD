package com.board.study.service;

import java.util.HashMap;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.study.dto.board.BoardResponseDto;
import com.board.study.dto.board.BoardRequestDto;
import com.board.study.entity.board.Board;
import com.board.study.entity.board.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository boardRepository;
	
	@Transactional
	public Long save(BoardRequestDto boardSaveDto) {
		return boardRepository.save(boardSaveDto.toEntity()).getId();
	}
	
	/*
		Ʈ����ǿ� readOnly=true �ɼ��� �ָ� ������ �����ӿ�ũ�� ���̹�����Ʈ ���� �÷��� ��带 MANUAL�� �����Ѵ�.
		�̷��� �ϸ� ������ �÷��ø� ȣ������ �ʴ� �� �÷��ð� �Ͼ�� �ʴ´�.
		���� Ʈ������� Ŀ���ϴ��� ���Ӽ� ���ؽ�Ʈ�� ��	���� ���� �ʾƼ� ��ƼƼ�� ���, ����, ������ �������� �ʰ�,
		���� �б� ��������, ���Ӽ� ���ؽ�Ʈ�� ���� ������ ���� �������� �������� �����Ƿ� ������ ���ȴ�.
	*/
	@Transactional(readOnly = true)
	public HashMap<String, Object> findAll(Integer page, Integer size) {
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		Page<Board> list = boardRepository.findAll(PageRequest.of(page, size));
		
		resultMap.put("list", list.stream().map(BoardResponseDto::new).collect(Collectors.toList()));
		resultMap.put("paging", list.getPageable());
		resultMap.put("totalCnt", list.getTotalElements());
		resultMap.put("totalPage", list.getTotalPages());
		
		return resultMap;
	}
	
	public BoardResponseDto findById(Long id) {
		return new BoardResponseDto(boardRepository.findById(id).get());
	}
	
	public int updateBoard(BoardRequestDto boardRequestDto) {
		return boardRepository.updateBoard(boardRequestDto);
	}
	
	public int updateBoardReadCntInc(Long id) {
		return boardRepository.updateBoardReadCntInc(id);
	}
	
	public void deleteById(Long id) {
		boardRepository.deleteById(id);
	}
}
