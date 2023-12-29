package org.example.springbootdeveloper.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.springbootdeveloper.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller//컨트롤러라는 것을 명시적으로 표시
public class ExampleController {

    @GetMapping("/thymeleaf/example")
    public String thyemleafExample(Model model){//뷰로 데이터를 넘겨주는 모델 객체
        Person examplePerson = new Person();
        examplePerson = Person.builder()
                .id(1L)
                .name("홍길동")
                .age(11)
                .hobbies(List.of("운동", "독서"))
                .build();

        model.addAttribute("person", examplePerson);//Person 객체 저장
        model.addAttribute("today", LocalDate.now());
        
        return "example";// example.html라는 뷰 조회
    }


}
