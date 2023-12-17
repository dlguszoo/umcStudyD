package com.example.librarysystem.domain.Member.Service;

import com.example.librarysystem.domain.Member.Entity.Member;
import com.example.librarysystem.domain.Member.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

}
