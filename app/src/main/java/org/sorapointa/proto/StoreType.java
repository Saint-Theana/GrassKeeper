package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum StoreType {
        @Tag(tag=0) StoreNone ,
        @Tag(tag=1) StorePack ,
        @Tag(tag=2) StoreDepot ;
}
