package com.bdd.controller;

import com.bdd.dto.MemberDto;
import com.bdd.service.MemberService;
import lombok.AllArgsConstructor;
<<<<<<< HEAD

import java.sql.SQLException;

=======
import org.hibernate.exception.ConstraintViolationException;
>>>>>>> origin/main

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

<<<<<<< HEAD
=======

>>>>>>> origin/main
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

    // 회원가입 처리
    @PostMapping("/user/signup")
    public String execSignup(MemberDto memberDto){
        return "redirect:/user/login";
    }

    // 로그인 페이지
    @GetMapping("/user/login")
    public String dispLogin() {
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