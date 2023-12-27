package com.example.librarysystem.domain.Member.Repository;

import com.example.librarysystem.domain.Member.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByMemberEmail(String email);
    Member findByMemberEmail(String email);
}
