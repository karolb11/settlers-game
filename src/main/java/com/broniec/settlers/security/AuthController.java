package com.broniec.settlers.security;

import com.broniec.settlers.user.RoleName;
import com.broniec.settlers.user.RoleRepository;
import com.broniec.settlers.user.User;
import com.broniec.settlers.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    final
    UserRepository userRepository;
    final
    RoleRepository roleRepository;
    final
    PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public String signUp(@RequestBody SignUpRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(Collections.singleton(roleRepository.findByName(RoleName.ROLE_USER)))
                .build();
        userRepository.save(user);
        return "ok";
    }
}
