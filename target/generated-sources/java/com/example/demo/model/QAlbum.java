package com.example.demo.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlbum is a Querydsl query type for Album
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAlbum extends EntityPathBase<Album> {

    private static final long serialVersionUID = -1719298160L;

    public static final QAlbum album = new QAlbum("album");

    public final StringPath albumMintitle = createString("albumMintitle");

    public final StringPath albumText = createString("albumText");

    public final DateTimePath<java.util.Date> albumTime = createDateTime("albumTime", java.util.Date.class);

    public final StringPath albumTitle = createString("albumTitle");

    public final StringPath coverMap = createString("coverMap");

    public final StringPath coverMaplist = createString("coverMaplist");

    public final NumberPath<Integer> dianzan = createNumber("dianzan", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> liulan = createNumber("liulan", Integer.class);

    public QAlbum(String variable) {
        super(Album.class, forVariable(variable));
    }

    public QAlbum(Path<? extends Album> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlbum(PathMetadata metadata) {
        super(Album.class, metadata);
    }

}

