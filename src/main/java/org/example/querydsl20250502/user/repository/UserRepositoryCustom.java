package org.example.querydsl20250502.user.repository;

import java.util.List;
import org.example.querydsl20250502.user.entity.SiteUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);

    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();

    List<SiteUser> getQslUsersOrderByIdAscOne();

    List<SiteUser> searchQsl(String kw);

    Page<SiteUser> searchQsl(String kw, Pageable pageable);
}
