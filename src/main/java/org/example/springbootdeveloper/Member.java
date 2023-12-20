package org.example.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)//기본 생성자
@AllArgsConstructor
@Entity//엔티티로 지정
public class Member {
    @Id//id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)//기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;//DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", updatable = false)//name이라는 not null 컬럼과 매핑
    private String name;//DB 테이블의 'name' 컬럼과 매칭
    
    /*
    * 자동키(@GeneratedValue)
    * - AUTO : 선택한 DB 방언(dialect)에 따라 방식을 자동으로 선택(기본값)
    * - IDENTITY : 기본키 생성을 DB에 위임(=AUTO_INCREMENT)
    * - SEQUENCE : DB 시퀀스를 이용해 기본키를 할당하는 방법. 오라클에서 주로 사용
    * - TABLE : 키 생성 테이블 사용
    * */

    /*
    @Column
    - name : 필드와 매핑할 컬럼 이름. 설정하지 않으면 필드 이름으로 지정해준다.
    - nullable : 컬럼의 null 허용 여부. 설정하지 않으면 true(nullable)
    - unique : 컬럼의 유일한 값 여부. 설정하지 않으면 false(non unique)
    - columnDefinition : 컬럼 정보 설정. default값을 줄 수 있다.
    * */
}
