package org.example.querydsl20250502.user.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.querydsl20250502.user.entity.QSiteUser;
import org.example.querydsl20250502.user.entity.SiteUser;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public SiteUser getQslUser(Long id) {
        /*
        SELECT *
        FROM site_user
        WHERE id = id
         */
        return jpaQueryFactory
                .select(QSiteUser.siteUser)
                .from(QSiteUser.siteUser)
                .where(QSiteUser.siteUser.id.eq(id))
                .fetchOne();
    }
}
