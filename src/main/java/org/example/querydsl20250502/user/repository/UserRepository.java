package org.example.querydsl20250502.user.repository;

import java.util.List;
import org.example.querydsl20250502.user.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long>, UserRepositoryCustom {
    List<SiteUser> findByInterestKeywords_content(String content);
}
