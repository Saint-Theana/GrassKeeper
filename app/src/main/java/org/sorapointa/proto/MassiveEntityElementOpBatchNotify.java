package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MassiveEntityElementOpBatchNotify {
    public enum MassiveEntityElementOpBatchNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=390) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6,isFloat=true) public Float attackElementDurability = null;
    @Tag(tag=9,isSigned=true) public Integer sourceElementType = null;
    @Tag(tag=11,isSigned=true) public Integer reactionSourceType = null;
    @Tag(tag=10) public Integer attackerId = null;
    @Tag(tag=4) public Integer userId = null;
    @Tag(tag=2,isSigned=true) public Integer entityType = null;
    @Tag(tag=7) public ShapeSphere shapeSphere = null;
    @Tag(tag=8) public ShapeBox shapeBox = null;
    @Tag(tag=1) public Integer opIdx = null;
}
