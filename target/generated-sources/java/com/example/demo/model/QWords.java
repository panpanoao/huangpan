package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWords is a Querydsl query type for Words
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWords extends EntityPathBase<Words> {

    private static final long serialVersionUID = -1698876470L;

    public static final QWords words = new QWords("words");

    public final NumberPath<Integer> albumid = createNumber("albumid", Integer.class);

    public final StringPath albumText = createString("albumText");

    public final DateTimePath<java.util.Date> albumTime = createDateTime("albumTime", java.util.Date.class);

    public final NumberPath<Integer> bowenid = createNumber("bowenid", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath userName = createString("userName");

    public final NumberPath<Integer> usersid = createNumber("usersid", Integer.class);

    public final StringPath wordsText = createString("wordsText");

    public final DateTimePath<java.util.Date> wordsTime = createDateTime("wordsTime", java.util.Date.class);

    public QWords(String variable) {
        super(Words.class, forVariable(variable));
    }

    public QWords(Path<? extends Words> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWords(PathMetadata metadata) {
        super(Words.class, metadata);
    }

}

