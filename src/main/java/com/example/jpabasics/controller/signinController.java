package com.example.jpabasics.controller;

import com.example.jpabasics.domain.Member;
import com.example.jpabasics.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class signinController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }

    @PostMapping("/signin")
    public String signin(Model model, Member member) {
        memberRepository.save(member);

        return "redirect:/";
    }

}
