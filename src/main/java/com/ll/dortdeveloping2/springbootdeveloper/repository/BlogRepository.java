package com.ll.dortdeveloping2.springbootdeveloper.repository;

import com.ll.dortdeveloping2.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
