package com.ll.dortdeveloping2.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Builder
    public User(String email, String password, String auth){
        this.email = email;
        this.password = password;
    }

    @Override // 권한 변환
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("user"));
    }

    // 사용자의 id를 반환(고유한 값)
    @Override
    public String getUsername() {
        return "email";
    }

    // 사용자의 비밀번호 반환
    @Override
    public String getPassword() {
        return "password";
    }

    // 계정 만료 여부 반환
    @Override
    public boolean isAccountNonExpired() { // 만료되었는지 확인하는 로직
        return true; // true -> 만료되지 않음
    }

    // 계정 잠금 여부 반환
    @Override
    public boolean isAccountNonLocked() { // 계정이 잠금되었는지 확인하는 로직
        return true; // true -> 잠금되지 않았음
    }

    // 비밀번호의 만료 여부 반환
    @Override
    public boolean isCredentialsNonExpired() { // 비밀번환가 만료되었는지 확인하는 로직
        return true; // true -> 만료되지 않았음
    }

    //계정 사용 가능 여부 반환
    @Override
    public boolean isEnabled() { // 계정이 사용 가능한지 확인하는 로직
        return true; //true -> 사용 가능
    } // UserDetails를 상속받아 인증 객체로 사용.
}