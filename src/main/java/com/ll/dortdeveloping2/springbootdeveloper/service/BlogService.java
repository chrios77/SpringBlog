package com.ll.dortdeveloping2.springbootdeveloper.service;

import com.ll.dortdeveloping2.springbootdeveloper.domain.Article;
import com.ll.dortdeveloping2.springbootdeveloper.dto.AddArticleRequest;
import com.ll.dortdeveloping2.springbootdeveloper.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogrepository;

    public Article save(AddArticleRequest request){
        return blogrepository.save(request.toEntity());
    }
}
