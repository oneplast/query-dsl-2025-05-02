package org.example.querydsl20250502.base.init;

import java.util.Arrays;
import java.util.List;
import org.example.querydsl20250502.user.entity.SiteUser;
import org.example.querydsl20250502.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestInitData {
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            SiteUser u1 = SiteUser.builder()
                    .username("user1")
                    .password("{noop}1234")
                    .email("user1@test.com")
                    .build();

            SiteUser u2 = SiteUser.builder()
                    .username("user2")
                    .password("{noop}1234")
                    .email("user2@test.com")
                    .build();

            List<SiteUser> siteUsers = userRepository.saveAll(Arrays.asList(u1, u2));
        };
    }
}
