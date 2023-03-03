package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FoundationOpType {
        @Tag(tag=0) FOUNDATION_OP_TYPE_NONE ,
        @Tag(tag=1) FOUNDATION_OP_TYPE_BUILD ,
        @Tag(tag=2) FOUNDATION_OP_TYPE_DEMOLITION ,
        @Tag(tag=3) FOUNDATION_OP_TYPE_REBUILD ,
        @Tag(tag=4) FOUNDATION_OP_TYPE_ROTATE ,
        @Tag(tag=5) FOUNDATION_OP_TYPE_LOCK ,
        @Tag(tag=6) FOUNDATION_OP_TYPE_UNLOCK ;
}
