# BlogService.java 분석

--- 

---

## BlogService.java에서 사용한 클래스 레벨 어노테이션

- @RequiredArgsConstructor 
- @Service

---

---

### @RequiredArgsConstructor
#### @RequiredArgsConstructor를 사용한 이유

- 

---

---

### @Service
#### @Service를 사용한 이유

---

---

## BlogService.java에서 사용한 메서드 레벨 어노테이션

- @Transactional

--- 

---

### @Transactional
#### @Transactional를 사용한 이유

- 

---

---

### BlogService에서 blogRepository의 역할 분석

```
private final BlogRepository blogRepository;
```

- 

---

---

### BlogService에서 save의 역할 분석

```
public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
```

- 

---

---

### BlogService에서 findAll()의 역할 분석

```
public List<Article> findAll(){
        return blogRepository.findAll();
    }
```

- 

---

---

### BlogService에서 delete의 역할 분석

```
public void delete(long id){
        blogRepository.deleteById(id);
    }
```

- 

---

---

### BlogService에서 update의 역할 분석

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

### BlogService에서 findById의 역할 분석

```
public Article findById(long id){
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    
    }
```

- 

---

---

> 참고 문헌:
> 1. 스프링 부트3 백엔드 개발자 되기 자바편 2판, 신성영 저
> 2.