# ArticleViewResponse.java 분석

--- 

---

## ArticleViewResponse.java에서 사용한 클래스 레벨 어노테이션

- @NoArgsConstructor
- @Getter

---

---

### @NoArgsConstructor
#### @NoArgsConstructor를 사용한 이유

-

---

---

### @Getter
#### @Getter를 사용한 이유

---

---


### ArticleViewResponse에서 id의 역할 분석

```
private long id;
```

-

---

---

### ArticleViewResponse에서 title의 역할 분석

```
private String title;
```

-

---

---

### ArticleViewResponse에서 content의 역할 분석

```
private String content;
```

-

---

---

### ArticleViewResponse에서 createdAt의 역할 분석

```
private LocalDateTime createdAt;
```

-

---

---

### ArticleViewResponse.java에서 기본 생성자 ArticleViewResponse의 역할 분석

```
public ArticleViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }
```

-

---

---

> 참고 문헌:
> 1. 스프링 부트3 백엔드 개발자 되기 자바편 2판, 신성영 저
> 2.