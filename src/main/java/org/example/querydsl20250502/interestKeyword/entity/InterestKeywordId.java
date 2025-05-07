package org.example.querydsl20250502.interestKeyword.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.querydsl20250502.user.entity.SiteUser;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestKeywordId implements Serializable {
    private SiteUser user;

    private String content;
}
