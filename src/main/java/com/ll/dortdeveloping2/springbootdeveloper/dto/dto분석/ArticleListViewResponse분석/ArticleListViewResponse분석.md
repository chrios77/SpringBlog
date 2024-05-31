# ArticleListViewResponse.java 분석

--- 

---

## ArticleListViewResponse.java에서 사용한 클래스 레벨 어노테이션

- @Getter

---

---

### @Getter
#### @Getter를 사용한 이유

-

---

---

### ArticleListViewResponse에서 id의 역할 분석

```
private final Long id;
```

-

---

---

### ArticleListViewResponse에서 title의 역할 분석

```
private final String title;
```

-

---

---

### ArticleListViewResponse에서 content의 역할 분석

```
private final String content;
```

-

---

---

### ArticleListViewResponse.java에서 기본 생성자 --> ArticleListViewResponse의 역할 분석

```
public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
```

-

---

---


> 참고 문헌:
> 1. 스프링 부트3 백엔드 개발자 되기 자바편 2판, 신성영 저
> 2.