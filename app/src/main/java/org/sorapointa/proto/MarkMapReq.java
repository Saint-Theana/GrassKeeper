package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkPoint.*;
import org.sorapointa.proto.MapMarkPoint;

public class MarkMapReq {
    public enum Operation {
        @Tag(tag=0) OPERATION_ADD ,
        @Tag(tag=1) OPERATION_MOD ,
        @Tag(tag=2) OPERATION_DEL ,
        @Tag(tag=3) OPERATION_GET ;
    }

    @Tag(tag=8) public MapMarkPoint mark = null;
    @Tag(tag=6) public MapMarkPoint old = null;
    @Tag(tag=9) public Operation op = null;
}
