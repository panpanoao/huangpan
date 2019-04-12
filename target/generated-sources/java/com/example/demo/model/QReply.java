package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReply is a Querydsl query type for Reply
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReply extends EntityPathBase<Reply> {

    private static final long serialVersionUID = -1703793653L;

    public static final QReply reply = new QReply("reply");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath replyText = createString("replyText");

    public final DateTimePath<java.util.Date> replyTime = createDateTime("replyTime", java.util.Date.class);

    public final StringPath userName = createString("userName");

    public final NumberPath<Integer> wordsid = createNumber("wordsid", Integer.class);

    public final StringPath wordsName = createString("wordsName");

    public QReply(String variable) {
        super(Reply.class, forVariable(variable));
    }

    public QReply(Path<? extends Reply> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReply(PathMetadata metadata) {
        super(Reply.class, metadata);
    }

}

