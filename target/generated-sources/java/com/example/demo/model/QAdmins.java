package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdmins is a Querydsl query type for Admins
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdmins extends EntityPathBase<Admins> {

    private static final long serialVersionUID = -1765707261L;

    public static final QAdmins admins = new QAdmins("admins");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath userName = createString("userName");

    public QAdmins(String variable) {
        super(Admins.class, forVariable(variable));
    }

    public QAdmins(Path<? extends Admins> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdmins(PathMetadata metadata) {
        super(Admins.class, metadata);
    }

}

