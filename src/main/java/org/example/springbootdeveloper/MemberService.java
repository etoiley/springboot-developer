package org.example.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void test(){
        //1)생성(create)
        memberRepository.save(new Member(1L, "A"));
        //2)조회(Read)
        Optional<Member>  member = memberRepository.findById(1L);//findById : id 지정해 엔티티를 하나 조회
        List<Member> allMembers = memberRepository.findAll();//findAll : 전체 엔티티를 조회

        //3)삭제(Delete)
        memberRepository.deleteById(1L);

    }
}
