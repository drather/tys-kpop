package com.entertainment.kpop.repository;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
