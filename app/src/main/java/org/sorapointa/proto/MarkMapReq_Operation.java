package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MarkMapReq_Operation {
        @Tag(tag=0) Add ,
        @Tag(tag=1) Mod ,
        @Tag(tag=2) Del ,
        @Tag(tag=3) Get ;
}
