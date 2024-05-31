# Article.java 분석

---

---

## Article.java에서 사용한 클래스 레벨 어노테이션

- @EntityListeners
- @Entity
- @Getter
- @AllArgsConstructor
- @NoArgsConstructor

---

---

### @EntityListeners
#### @EntityListeners를 사용한 이유

- 

---

---

### @Entity
#### @Entity를 사용한 이유

- 

---

---

### @Getter
#### @Getter를 사용한 이유

- 

---

---

### @AllArgsConstructor
#### @AllArgsConstructor를 사용한 이유

- 

---

---

### @NoArgsConstructor
#### @NoArgsConstructor를 사용한 이유

- 

---

---

## Article.java에서 사용한 메소드 레벨 어노테이션

- @Id
- @GeneratedValue
- @Column
- @CreatedDate
- @LastModifiedDate
- @Builder

---

---

### @Id
#### @Id를 사용한 이유

- 

---

---

### @GeneratedValue
#### @GeneratedValue를 사용한 이유

- 

---

---

### @Column
#### @Column을 사용한 이유

- 

---

---

### @CreatedDate
#### @CreatedDate를 사용한 이유

- 

---

---

### @LastModifiedDate
#### @LastModifiedDate를 사용한 이유

- 

---

---

### @Builder
#### @Builder를 사용한 이유

- 

---

---

### 클래스 Article에서 id의 역할 분석

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", updatable = false)
private Long id;
```

- 

---

---

### 클래스 Article에서 title의 역할 분석
```
@Column(name = "title", nullable = false)
private String title;
```

- 

---

---

### 클래스 Article에서 content의 역할 분석
```
@Column(name = "content", nullable = false)
private String content;
```

- 

---

---

### 클래스 Article에서 createdAt의 역할 분석
```
@CreatedDate
@Column(name = "created_at")
private LocalDateTime createdAt;
```

- 

---

---

### 클래스 Article에서 updatedAt 분석
```
@LastModifiedDate
@Column(name = "updated_at")
private LocalDateTime updatedAt;
```

- 

---

---

### Article.java에서 기본 생성자 -> Article 분석

```
@Builder
public Article(String title, String content){
      this.title = title;
      this.content = content;
  }
```

- 

---

---

### Article.java에서 update 분석

```
public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
```

- 

---

---

> 참고 문헌: 
> 1. 스프링 부트3 백엔드 개발자 되기 자바편 2판, 신성영 저 
> 2.