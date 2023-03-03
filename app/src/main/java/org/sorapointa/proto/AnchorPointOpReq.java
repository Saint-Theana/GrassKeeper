package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AnchorPointOpReq {
    public enum AnchorPointOpType {
        @Tag(tag=0) ANCHOR_POINT_OP_TYPE_NONE ,
        @Tag(tag=1) ANCHOR_POINT_OP_TYPE_TELEPORT ,
        @Tag(tag=2) ANCHOR_POINT_OP_TYPE_REMOVE ;
    }

    @Tag(tag=9) public Integer anchorPointId = null;
    @Tag(tag=12) public Integer anchorPointOpType = null;
}
