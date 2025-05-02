package org.example.querydsl20250502.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.querydsl20250502.user.entity.SiteUser;
import org.example.querydsl20250502.user.repository.UserRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @RequestMapping("/user/{id}")
    public SiteUser user(@PathVariable Long id) {
        return userRepository.getQslUser(id);
    }
}
