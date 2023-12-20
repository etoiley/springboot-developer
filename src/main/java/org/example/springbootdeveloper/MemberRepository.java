package org.example.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
//Repository는 엔티티에 있는 데이터들을 조회하거나 저장, 변경, 삭제를 힐 떼 사용하는 인터페이스
}
