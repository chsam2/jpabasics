package com.example.jpabasics.controller;

import java.util.List;

import com.example.jpabasics.domain.Member;
import com.example.jpabasics.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/main")
    public String login(Model model, String memberid, String memberpw) {
        Member member = new Member();
        member = memberRepository.findByMemberid(memberid);
        if (memberpw.equals(member.getMemberpw())) {
            List<Member> allmember = memberRepository.findAllByMemberbirth(member.getMemberbirth());
            model.addAttribute("allmember", allmember);
            return "main";
        }

        return "redirect:/";
    }

}
