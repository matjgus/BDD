package com.bdd.dto;

import com.bdd.domain.entity.MemberEntity;
import lombok.*;

import lombok.Data;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private int uid;
    private String id;
    private String name;
    private String password;
    private int post;
    private String address;
    private String detailaddress;
    private String email;
    private int phonenum;
    private String role;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .uid(uid)
                .name(name)
                .id(id)
                .password(password)
                .post(post)
                .address(address)
                .detailaddress(detailaddress)
                .email(email)
                .phonenum(phonenum)
                .role(role)
                .build();
    }

    @Builder
    public MemberDto(int uid, String id, String name, String password, int post, String address, String detailaddress, String email, int phonenum, String role) {
        this.uid = uid;
        this.id = id;
        this.name = name;
        this.password = password;
        this.post = post;
        this.address = address;
        this.detailaddress = detailaddress;
        this.email = email;
        this.phonenum = phonenum;
        this.role = role;
    }
}