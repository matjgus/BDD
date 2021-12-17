package com.bdd.service;

import com.bdd.config.CustomUserDetails;
import com.bdd.config.UserCustom;
import com.bdd.domain.Role;
import com.bdd.domain.entity.MemberEntity;
import com.bdd.domain.repository.MemberRepository;
import com.bdd.dto.MemberDto;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {
    private MemberRepository memberRepository;

    @Transactional
    public int joinUser(MemberDto memberDto) throws SQLException{
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        memberDto.setPassword(passwordEncoder.encode(memberDto.getPassword()));
        System.out.println("success");
        return memberRepository.save(memberDto.toEntity()).getUid();
    }

//    @Override
//    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//        Optional<MemberEntity> userEntityWrapper = memberRepository.findById(userId);
//        if(userEntityWrapper.isEmpty()){
//            return null;
//        }else {
//            MemberEntity userEntity = userEntityWrapper.get();
//            System.out.println(userEntity);
//            
//            List<GrantedAuthority> authorities = new ArrayList<>();
//            
//            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
//            // System.out.println("password" + userEntity.getPassword());
//            // System.out.println("authorities" + authorities);
//            return new User(userEntity.getId(), userEntity.getPassword(), authorities);
//        }
//    }
    
    @Override
    public CustomUserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
    	CustomUserDetails customUserDetails = new CustomUserDetails();
    	 MemberDto member = null;
    	Optional<MemberEntity> userEntityWrapper = memberRepository.findById(userId);
    	
          customUserDetails.setName(member.getName());
          customUserDetails.setPassword(member.getPassword());
          customUserDetails.setEnabled(true);
          customUserDetails.setAccountNonExpired(true);
          customUserDetails.setAccountNonLocked(true);
          customUserDetails.setCredentialsNonExpired(true);
          customUserDetails.setId(member.getId());
          customUserDetails.setPost(member.getPost());
          customUserDetails.setPhonenum(member.getPhonenum());
          customUserDetails.setAddress(member.getAddress());
          customUserDetails.setDetailaddress(member.getDetailaddress());
          customUserDetails.setEmail(member.getEmail());
           
           return customUserDetails;
           // System.out.println("password" + userEntity.getPassword());
           // System.out.println("authorities" + authorities);
//           return new UserCustom(userEntity.getName(), userEntity.getPassword(), true, true, true, true, authorities, userEntity.getId(), userEntity.getName(), userEntity.getPost(), userEntity.getAddress(), userEntity.getDetailaddress(), userEntity.getEmail(), userEntity.getPhonenum());
       }
    }

    
    public int checkLogin(String userId,String userPw){
        UserDetails tmp = this.loadUserByUsername(userId);
        if(tmp == null){
            return 1;
        }else {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            if (!passwordEncoder.matches(userPw,tmp.getPassword())){
                System.out.println("no match");
                return 2;
            }else{
                System.out.println("match");
            }
            return 0;
        }
    }

}
