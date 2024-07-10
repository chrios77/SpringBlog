package com.ll.dortdeveloping2.springbootdeveloper.service;

import com.ll.dortdeveloping2.springbootdeveloper.domain.User;
import com.ll.dortdeveloping2.springbootdeveloper.dto.AddUserRequest;
import com.ll.dortdeveloping2.springbootdeveloper.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto){
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                // 비밀번호 암호화
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
