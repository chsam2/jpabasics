package com.example.jpabasics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {

    @Id
    @Column(name = "member_id")
    private String memberid;
    @Column(name = "member_pw")
    private String memberpw;
    @Column(name = "member_birth")
    private String memberbirth;
    @Column(name = "member_number")
    private String membernumber;
}
