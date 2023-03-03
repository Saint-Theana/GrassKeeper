package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GetUgcType {
        @Tag(tag=0) GET_UGC_TYPE_NONE ,
        @Tag(tag=1) GET_UGC_TYPE_MINE ,
        @Tag(tag=2) GET_UGC_TYPE_PUBLISH ;
}
