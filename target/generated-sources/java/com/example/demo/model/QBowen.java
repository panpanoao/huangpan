package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBowen is a Querydsl query type for Bowen
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBowen extends EntityPathBase<Bowen> {

    private static final long serialVersionUID = -1718265580L;

    public static final QBowen bowen = new QBowen("bowen");

    public final StringPath bowenMap = createString("bowenMap");

    public final StringPath bowenMintitle = createString("bowenMintitle");

    public final StringPath bowenText = createString("bowenText");

    public final StringPath bowenTitle = createString("bowenTitle");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Integer> dianzan = createNumber("dianzan", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> liulan = createNumber("liulan", Integer.class);

    public QBowen(String variable) {
        super(Bowen.class, forVariable(variable));
    }

    public QBowen(Path<? extends Bowen> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBowen(PathMetadata metadata) {
        super(Bowen.class, metadata);
    }

}

