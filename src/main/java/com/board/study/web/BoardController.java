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
   
   @GetMapping("/index")
   public String getIndexPage(Model model, BoardRequestDto boardRequestDto) {
      return "/index";
   }
   
   @GetMapping("/page/footer")
   public String getFooter(Model model, BoardRequestDto boardRequestDto) {
      return "/page/footer";
   }
   //소개 페이지
   @GetMapping("/page/intro")
   public String getIntroPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/intro";
   }
   @GetMapping("/page/intro-map")
   public String getIntroMapPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/intro-map";
   }
   //후원 페이지
   @GetMapping("/page/donation")
   public String getDonationPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/donation";
   }
   @GetMapping("/page/sponsorship")
   public String getSponsorshipPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/sponsorship";
   }
   @GetMapping("/page/story")
   public String getStoryPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/story";
   }
   @GetMapping("/page/reverse_sponsorship")
   public String getReverseSponsorshipPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/reverse_sponsorship";
   }
   
   //고객센터 페이지
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
   
   @GetMapping("/page/service_board")
   public String getBoardWritePage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/service_board";
   }
   
   @PostMapping("/page/service_board/action")
   public String pageWriteAction(Model model, BoardRequestDto boardRequestDto) throws Exception {
	      
	      try {
	         Long result = boardService.save(boardRequestDto);
	         
	         if (result < 1) {
	            throw new Exception("#Exception boardWriteAction!");
	         }
	      } catch (Exception e) {
	         throw new Exception(e.getMessage()); 
	      }
	      
	      return "redirect:/page/service";
   }
   
   @GetMapping("/page/service_view")
   public String getBoardViewPage(Model model, BoardRequestDto boardRequestDto) throws Exception {
      
      try {
         if (boardRequestDto.getId() != null) {
            model.addAttribute("info", boardService.findById(boardRequestDto.getId()));
         }
      } catch (Exception e) {
         throw new Exception(e.getMessage()); 
      }
      
      return "/page/service_view";
   }
   @PostMapping("/page/service_view/action")
   public String boardViewAction(Model model, BoardRequestDto boardRequestDto) throws Exception {
      
      try {
         int result = boardService.updateBoard(boardRequestDto);
         
         if (result < 1) {
            throw new Exception("#Exception boardViewAction!");
         }
      } catch (Exception e) {
         throw new Exception(e.getMessage()); 
      }
      
      return "redirect:/page/service";
   }
   
   
   //기부금영수증
   @GetMapping("/page/donationbill")
   public String getDonationBillPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/donationbill";
   }
   @GetMapping("/page/donationhistory")
   public String getDonationHistoryPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/donationhistory";
   }
   //로그인
   @GetMapping("/page/login")
   public String getLoginPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/login";
   }
   @GetMapping("/page/signup")
   public String getSignupPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/signup";
   }
   //메뉴바 항목
   @GetMapping("/page/profile")
   public String getProfilePage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/profile";
   }
   @GetMapping("/page/mydeed")
   public String getMyDeedPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/mydeed";
   }
   @GetMapping("/page/benefit")
   public String getBenefitPage(Model model, BoardRequestDto boardRequestDto) {
      return "/page/benefit";
   }
   
   
   
   
   
   
   
   
   
   
   //예제

   
   @PostMapping("/page/service_view/delete")
   public String boardViewDeleteAction(Model model, @RequestParam() Long id) throws Exception {
      
      try {
         boardService.deleteById(id);
      } catch (Exception e) {
         throw new Exception(e.getMessage()); 
      }
      
      return "redirect:/page/service";
   }
   
   @PostMapping("/page/delete")
   public String boardDeleteAction(Model model, @RequestParam() Long[] deleteId) throws Exception {
      
      try {
         boardService.deleteAll(deleteId);
      } catch (Exception e) {
         throw new Exception(e.getMessage()); 
      }
      
      return "redirect:/page/service";
   }
}