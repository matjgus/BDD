package com.board.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.study.dto.board.BoardRequestDto;
import com.board.study.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BoardController {
	
	private final BoardService boardService;
	
	
	@GetMapping("/page/header")
	public String getHeader(Model model, BoardRequestDto boardRequestDto) {
		return "/page/header";
	}
	@GetMapping("/page/service")
	public String getBoardListPage(Model model
			, @RequestParam(required = false, defaultValue = "0") Integer page
			, @RequestParam(required = false, defaultValue = "5") Integer size) throws Exception {
		
		try {
			model.addAttribute("resultMap", boardService.findAll(page, size));
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
		
		return "/page/service";
	}
	@GetMapping("/page/footer")
	public String getFooter(Model model, BoardRequestDto boardRequestDto) {
		return "/page/footer";
	}
	@GetMapping("/page/benefit")
	public String getBenefit(Model model, BoardRequestDto boardRequestDto) {
		return "/page/benefit";
	}
	@GetMapping("/index")
	public String getIndex(Model model, BoardRequestDto boardRequestDto) {
		return "/index";
	}
	@GetMapping("/page/donation")
	public String getDonation(Model model, BoardRequestDto boardRequestDto) {
		return "/page/donation";
	}
	
	@GetMapping("/page/donationbill")
	public String getDonationbill(Model model, BoardRequestDto boardRequestDto) {
		return "/page/donationbill";
	}
	@GetMapping("/page/donationhistory")
	public String getDonationhistory(Model model, BoardRequestDto boardRequestDto) {
		return "/page/donationhistory";
	}
	
	@GetMapping("/page/intro")
	public String getIntro(Model model, BoardRequestDto boardRequestDto) {
		return "/page/intro";
	}
	@GetMapping("/page/intro-map")
	public String getIntromap(Model model, BoardRequestDto boardRequestDto) {
		return "/page/intro-map";
	}
	@GetMapping("/page/login")
	public String getLogin(Model model, BoardRequestDto boardRequestDto) {
		return "/page/login";
	}
	@GetMapping("/page/mydeed")
	public String getMydeed(Model model, BoardRequestDto boardRequestDto) {
		return "/page/mydeed";
	}
	@GetMapping("/page/profile")
	public String getProfile(Model model, BoardRequestDto boardRequestDto) {
		return "/page/profile";
	}
	@GetMapping("/page/reverse_sponsorship")
	public String getReverse_sponsorship(Model model, BoardRequestDto boardRequestDto) {
		return "/page/reverse_sponsorship";
	}
	@GetMapping("/page/signup")
	public String getSignup(Model model, BoardRequestDto boardRequestDto) {
		return "/page/signup";
	}
	@GetMapping("/page/sponsorship")
	public String getSponsorship(Model model, BoardRequestDto boardRequestDto) {
		return "/page/sponsorship";
	}
	@GetMapping("/page/story")
	public String getStory(Model model, BoardRequestDto boardRequestDto) {
		return "/page/story";
	}
	
	@GetMapping("/page/service_board")
	public String getBoardWritePage(Model model, BoardRequestDto boardRequestDto) {
		return "/page/service_board";
	}
	
	@GetMapping("/board/view")
	public String getBoardViewPage(Model model, BoardRequestDto boardRequestDto) throws Exception {
		
		try {
			if (boardRequestDto.getId() != null) {
				model.addAttribute("info", boardService.findById(boardRequestDto.getId()));
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
		
		return "/board/view";
	}
	
	@PostMapping("/board/write/action")
	public String boardWriteAction(Model model, BoardRequestDto boardRequestDto) throws Exception {
		
		try {
			Long result = boardService.save(boardRequestDto);
			
			if (result < 1) {
				throw new Exception("#Exception boardWriteAction!");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/board/view/action")
	public String boardViewAction(Model model, BoardRequestDto boardRequestDto) throws Exception {
		
		try {
			int result = boardService.updateBoard(boardRequestDto);
			
			if (result < 1) {
				throw new Exception("#Exception boardViewAction!");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/board/view/delete")
	public String boardViewDeleteAction(Model model, @RequestParam() Long id) throws Exception {
		
		try {
			boardService.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/board/delete")
	public String boardDeleteAction(Model model, @RequestParam() Long[] deleteId) throws Exception {
		
		try {
			boardService.deleteAll(deleteId);
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
		
		return "redirect:/board/list";
	}
}
