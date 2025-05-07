package org.example.querydsl20250502.user.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSiteUser is a Querydsl query type for SiteUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSiteUser extends EntityPathBase<SiteUser> {

    private static final long serialVersionUID = 2082134365L;

    public static final QSiteUser siteUser = new QSiteUser("siteUser");

    public final StringPath email = createString("email");

    public final SetPath<SiteUser, QSiteUser> followers = this.<SiteUser, QSiteUser>createSet("followers", SiteUser.class, QSiteUser.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<org.example.querydsl20250502.interestKeyword.entity.InterestKeyword, org.example.querydsl20250502.interestKeyword.entity.QInterestKeyword> interestKeywords = this.<org.example.querydsl20250502.interestKeyword.entity.InterestKeyword, org.example.querydsl20250502.interestKeyword.entity.QInterestKeyword>createSet("interestKeywords", org.example.querydsl20250502.interestKeyword.entity.InterestKeyword.class, org.example.querydsl20250502.interestKeyword.entity.QInterestKeyword.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final StringPath username = createString("username");

    public QSiteUser(String variable) {
        super(SiteUser.class, forVariable(variable));
    }

    public QSiteUser(Path<? extends SiteUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSiteUser(PathMetadata metadata) {
        super(SiteUser.class, metadata);
    }

}

