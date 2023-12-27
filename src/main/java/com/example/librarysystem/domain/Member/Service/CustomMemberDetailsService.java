package com.example.librarysystem.domain.Member.Service;

import com.example.librarysystem.domain.Member.Dto.CustomMemberDetails;
import com.example.librarysystem.domain.Member.Entity.Member;
import com.example.librarysystem.domain.Member.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomMemberDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByMemberEmail(email);
        if(member != null) { //존재하는 회원이면 (email 존재)
            return new CustomMemberDetails(member);
        }
        return null; //없는 회원이면 (email 없음)
    }
}
