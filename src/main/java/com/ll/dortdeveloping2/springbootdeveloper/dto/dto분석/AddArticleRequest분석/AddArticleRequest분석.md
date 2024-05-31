# AddArticleRequest.java 분석

--- 

---

## AddArticleRequest.java에서 사용한 클래스 레벨 어노테이션

- @NoArgsConstructor
- @AllArgsConstructor
- @Getter

---

---

### @NoArgsConstructor
#### @NoArgsConstructor를 사용한 이유

-

---

---

### @AllArgsConstructor
#### @AllArgsConstructor를 사용한 이유

---

---

### @Getter
#### @Getter를 사용한 이유

---

---

### AddArticleRequest에서 title의 역할 분석

```
private String title;
```

-

---

---

### AddArticleRequest에서 content의 역할 분석

```
private String content;
```

-

---

---

### AddArticleRequest에서 toEntity()의 역할 분석

```
public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
```

-

---

---

> 참고 문헌:
> 1. 스프링 부트3 백엔드 개발자 되기 자바편 2판, 신성영 저
> 2.