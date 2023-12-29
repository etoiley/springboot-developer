package org.example.springbootdeveloper.domain;

import lombok.*;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@Setter
public class Person {
    private Long id;
    private String name;
    private int age;
    private List<String> hobbies;
}
