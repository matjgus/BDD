package com.bdd.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Setter
@Table(name = "tb_user")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int uid;
    
    @Column(length = 30, nullable = false,unique = true)
    private String id;    

    @Column(length = 30, nullable = false)
    private String name;    
    
    @Column(length = 256, nullable = false)
    private String password;    
    
    @Column(length = 11, nullable = false)
    private int post;    

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 100, nullable = false)
    private String detailaddress;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 12, nullable = false)
    private int phonenum;

    @Column(length = 30, nullable = true)
    private int member_donation; 

    @Column(length = 30, nullable = true)
    private int my_deednum; 

    @Builder
    public MemberEntity(int uid, String id, String name, String password, int post, String address,
     String detailaddress, String email, int phonenum, int member_donation, int my_deednum) {
        this.uid = uid;
        this.id = id;
        this.name = name;
        this.password = password;
        this.post = post;
        this.address = address;
        this.detailaddress = detailaddress;
        this.email = email;
        this.phonenum = phonenum;
        this.member_donation = member_donation;
        this.my_deednum = my_deednum;
    }
}