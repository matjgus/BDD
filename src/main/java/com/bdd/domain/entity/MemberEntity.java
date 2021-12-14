package com.bdd.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Table(name = "tb_user")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int uid;
    
    @Column(length = 30, nullable = false, unique = true)
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

    @Builder
    public MemberEntity(int uid, String id, String name, String password, int post, String address, String detailaddress, String email, int phonenum) {
        this.uid = uid;
        this.id = id;
        this.name = name;
        this.password = password;
        this.post = post;
        this.address = address;
        this.detailaddress = detailaddress;
        this.email = email;
        this.phonenum = phonenum;
    }
}
