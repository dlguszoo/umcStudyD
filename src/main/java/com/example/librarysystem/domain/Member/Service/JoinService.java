package com.example.librarysystem.domain.Member.Service;

import com.example.librarysystem.domain.Member.Dto.JoinDto;
import com.example.librarysystem.domain.Member.Entity.Member;
import com.example.librarysystem.domain.Member.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public void joinProcess(JoinDto joinDto) {

        boolean isMember = memberRepository.existsByMemberEmail(joinDto.getEmail());
        if (isMember) {
            System.out.println("이미 가입된 회원입니다");
            return;
        }

        Member member = Member.builder()
                .password(bCryptPasswordEncoder.encode(joinDto.getPassword()))
                .email(joinDto.getEmail())
                .phoneNum(joinDto.getPhoneNum())
                .name(joinDto.getName())
                .gender(joinDto.getGender())
                .build();
        memberRepository.save(member);
    }
}
