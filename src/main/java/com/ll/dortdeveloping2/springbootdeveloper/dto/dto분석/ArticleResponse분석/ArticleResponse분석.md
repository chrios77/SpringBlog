# ArticleResponse.java 분석

--- 

---

## ArticleResponse.java에서 사용한 클래스 레벨 어노테이션

- @Getter

---

---

### @Getter
#### @Getter를 사용한 이유

-

---

---


### ArticleResponse에서 title의 역할 분석

```
private final String title;
```

-

---

---

### ArticleResponse에서 content의 역할 분석

```
private final String content;
```

-

---

---

### ArticleResponse.java에서 기본 생성자 --> ArticleResponse의 역할 분석

```
public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }```

- 

---

---

### ArticleResponse에서 delete의 역할 분석

```
public void delete(long id){
blogRepository.deleteById(id);
}
```

- 

---

---

### ArticleResponse에서 update의 역할 분석

```
@Transactional
public Article update(long id, UpdateArticleRequest request){
Article article = blogRepository.findById(id)
.orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
      
    }
```

- 

---

---

### ArticleResponse에서 findById의 역할 분석

```


```

- 

---

---

> 참고 문헌:
> 1. 스프링 부트3 백엔드 개발자 되기 자바편 2판, 신성영 저
> 2.