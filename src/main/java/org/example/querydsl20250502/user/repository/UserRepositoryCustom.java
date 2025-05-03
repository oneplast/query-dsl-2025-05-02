package org.example.querydsl20250502.user.repository;

import java.util.List;
import org.example.querydsl20250502.user.entity.SiteUser;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);

    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();

    List<SiteUser> getQslUsersOrderByIdAscOne();
}
