package com.bdd.controller;

import com.bdd.dto.MemberDto;
import com.bdd.service.MemberService;
import lombok.AllArgsConstructor;

import java.sql.SQLException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin
@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;


    // 메인 페이지
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // 회원가입 페이지
    
    @GetMapping("/user/signup")
    public String dispSignup() {
        return "page/signup";
    }
    // 회원가입 테스트
    @PostMapping("testgo")
    @ResponseBody
    public Object vuesign(@RequestBody MemberDto st){
        System.out.println("===========================");
        System.out.println(st);
        System.out.println("===========================");
        memberService.joinUser(st);
        ResponseEntity response = null;
        try {
            System.out.println("회원가입 시도중");
           
            response = new ResponseEntity<String>("success", HttpStatus.OK);
            System.out.println("회원가입완료");
        } catch (Exception e) {
            response = new ResponseEntity<String>("fail", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return "redirect:/user/login";
    }
    
    // 회원가입 처리
    @PostMapping("/user/signup")
    @ResponseBody
    public String execSignup(@RequestBody MemberDto memberDto){
        memberService.joinUser(memberDto);
        System.out.println(memberDto);
        
        return "redirect:/user/login";
    }
    
    // 로그인 페이지
    @GetMapping("/user/login")
    public String dispLogin(){
        //memberService.loadUserByUsername()
        return "page/login";
    }

//    // 접근 거부 페이지
//    @GetMapping("/user/denied")
//    public String dispDenied() {
//        return "/denied";
//    }

    // 내 정보 페이지
    @GetMapping("/user/info")
    public String dispMyInfo() {
        return "page/profile";
    }
    
    @GetMapping("/user/login/result")
    public String dispLoginResult() {
        return "page/loginSuccess";
    }
    
    @GetMapping("/user/logout/result")
    public String dispLogoutResult() {
        return "page/logout";
    }

//    // 어드민 페이지
//    @GetMapping("/admin")
//    public String dispAdmin() {
//        return "/admin";
//    }
    
    
    
}