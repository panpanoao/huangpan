package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QZan is a Querydsl query type for Zan
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QZan extends EntityPathBase<Zan> {

    private static final long serialVersionUID = -1128021112L;

    public static final QZan zan = new QZan("zan");

    public final NumberPath<Integer> albumid = createNumber("albumid", Integer.class);

    public final DateTimePath<java.util.Date> albumTime = createDateTime("albumTime", java.util.Date.class);

    public final NumberPath<Integer> bowenid = createNumber("bowenid", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> usersid = createNumber("usersid", Integer.class);

    public final DateTimePath<java.util.Date> zanTime = createDateTime("zanTime", java.util.Date.class);

    public QZan(String variable) {
        super(Zan.class, forVariable(variable));
    }

    public QZan(Path<? extends Zan> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZan(PathMetadata metadata) {
        super(Zan.class, metadata);
    }

}

