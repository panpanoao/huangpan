package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QScore is a Querydsl query type for Score
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScore extends EntityPathBase<Score> {

    private static final long serialVersionUID = -1702930509L;

    public static final QScore score = new QScore("score");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> pid = createNumber("pid", Integer.class);

    public final StringPath pname = createString("pname");

    public final StringPath scoredate = createString("scoredate");

    public final StringPath testscoreId = createString("testscoreId");

    public QScore(String variable) {
        super(Score.class, forVariable(variable));
    }

    public QScore(Path<? extends Score> path) {
        super(path.getType(), path.getMetadata());
    }

    public QScore(PathMetadata metadata) {
        super(Score.class, metadata);
    }

}

