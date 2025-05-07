package org.example.querydsl20250502.interestKeyword.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInterestKeyword is a Querydsl query type for InterestKeyword
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterestKeyword extends EntityPathBase<InterestKeyword> {

    private static final long serialVersionUID = -1421654042L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInterestKeyword interestKeyword = new QInterestKeyword("interestKeyword");

    public final StringPath content = createString("content");

    public final org.example.querydsl20250502.user.entity.QSiteUser user;

    public QInterestKeyword(String variable) {
        this(InterestKeyword.class, forVariable(variable), INITS);
    }

    public QInterestKeyword(Path<? extends InterestKeyword> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInterestKeyword(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInterestKeyword(PathMetadata metadata, PathInits inits) {
        this(InterestKeyword.class, metadata, inits);
    }

    public QInterestKeyword(Class<? extends InterestKeyword> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new org.example.querydsl20250502.user.entity.QSiteUser(forProperty("user")) : null;
    }

}

