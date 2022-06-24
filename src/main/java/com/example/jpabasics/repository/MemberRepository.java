package com.example.jpabasics.repository;

import java.util.List;

import com.example.jpabasics.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
    public Member findByMemberid(String memberid);

    public List<Member> findAllByMemberbirth(String memberbirth);
}
