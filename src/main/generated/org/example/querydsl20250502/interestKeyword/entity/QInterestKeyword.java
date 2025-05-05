package org.example.querydsl20250502.interestKeyword.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInterestKeyword is a Querydsl query type for InterestKeyword
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterestKeyword extends EntityPathBase<InterestKeyword> {

    private static final long serialVersionUID = -1421654042L;

    public static final QInterestKeyword interestKeyword = new QInterestKeyword("interestKeyword");

    public final StringPath content = createString("content");

    public QInterestKeyword(String variable) {
        super(InterestKeyword.class, forVariable(variable));
    }

    public QInterestKeyword(Path<? extends InterestKeyword> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInterestKeyword(PathMetadata metadata) {
        super(InterestKeyword.class, metadata);
    }

}

