package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ForwardType {
        @Tag(tag=0) FORWARD_TYPE_LOCAL ,
        @Tag(tag=1) FORWARD_TYPE_TO_ALL ,
        @Tag(tag=2) FORWARD_TYPE_TO_ALL_EXCEPT_CUR ,
        @Tag(tag=3) FORWARD_TYPE_TO_HOST ,
        @Tag(tag=4) FORWARD_TYPE_TO_ALL_GUEST ,
        @Tag(tag=5) FORWARD_TYPE_TO_PEER ,
        @Tag(tag=6) FORWARD_TYPE_TO_PEERS ,
        @Tag(tag=7) FORWARD_TYPE_ONLY_SERVER ,
        @Tag(tag=8) FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR ;
}
