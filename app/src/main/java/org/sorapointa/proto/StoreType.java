package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum StoreType {
        @Tag(tag=0) STORE_TYPE_NONE ,
        @Tag(tag=1) STORE_TYPE_PACK ,
        @Tag(tag=2) STORE_TYPE_DEPOT ;
}
