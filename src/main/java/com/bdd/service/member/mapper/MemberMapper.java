package com.bdd.service.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bdd.config.UserCustom;
import com.bdd.dto.MemberDto;

import java.lang.reflect.Member;
import java.util.Map;

@Mapper
public interface MemberMapper {
    MemberDto chkLogin(String user_email);

    int insertMember(MemberDto memberDTO);

    // 로그아웃-토큰삭제
    int deletePersistentLogins(UserCustom userCustom);
}