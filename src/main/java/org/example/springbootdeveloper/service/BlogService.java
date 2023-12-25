package org.example.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.domain.Article;
import org.example.springbootdeveloper.dto.AddArticleRequest;
import org.example.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor//final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service//빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메소드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    //DB에 저장되어 있는 글을 모두 가져오는 메소드
    public List<Article> findAll(){
        return blogRepository.findAll();
        //findAll()은 JPA의 지원메소드
    }
}
