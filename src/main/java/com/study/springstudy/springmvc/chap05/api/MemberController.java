package com.study.springstudy.springmvc.chap05.api;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/members")
@Slf4j
public class MemberController {

    // 회원가입 양식 열기
    @GetMapping("/sign-up")
    public void signUp(){
        log.info("/member/sign-up GET : forwarding to sign-up.jsp");
//        return "members/sign-up";
    }

}
