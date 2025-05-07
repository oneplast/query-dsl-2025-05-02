package org.example.querydsl20250502.interestKeyword.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.querydsl20250502.user.entity.SiteUser;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@IdClass(InterestKeywordId.class)
public class InterestKeyword {
    @Id
    @ManyToOne
    @EqualsAndHashCode.Include
    private SiteUser user;

    @Id
    @EqualsAndHashCode.Include
    private String content;
}
