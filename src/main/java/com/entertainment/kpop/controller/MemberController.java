package com.entertainment.kpop.controller;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.domain.Member;
import com.entertainment.kpop.dto.MemberDto;
import com.entertainment.kpop.service.ArtistService;
import com.entertainment.kpop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberService memberService;

    @Autowired
    ArtistService artistService;

    @GetMapping
    public List<Member> getMembers() {
        List<Member> res = memberService.findAll();
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.findById(id);
    }

    @PostMapping
    public Member insertMember(@RequestBody MemberDto dto) {
        Member member = new Member();
        return memberService.save(member);
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable("id") int id, @RequestBody MemberDto dto) {
        Member member = memberService.findById(id);
        Artist artist = artistService.findById(id);

        member.setMember(
                dto.getName(), dto.getAge(), dto.getGender(),
                dto.getPosition(), dto.getImg(), artist);

        return member;
    }

    @DeleteMapping("{id}")
    public int deleteMember(@PathVariable int id) {
        memberService.delete(id);
        return id;
    }
}
