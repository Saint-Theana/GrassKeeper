package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShapeBox.*;
import org.sorapointa.proto.ShapeBox;
import org.sorapointa.proto.ShapeSphere.*;
import org.sorapointa.proto.ShapeSphere;

public class MassiveEntityElementOpBatchNotify {
    @Tag(tag=6,isSigned=true) public Integer entityType = null;
    @Tag(tag=9) public Integer opIdx = null;
    @Tag(tag=11) public Integer userId = null;
    @Tag(tag=3) public Integer attackerId = null;
    @Tag(tag=12,isSigned=true) public Integer sourceElementType = null;
    @Tag(tag=4,isSigned=true) public Integer reactionSourceType = null;
    @Tag(tag=7,isFloat=true) public Float attackElementDurability = null;
    @Tag(tag=10) public ShapeSphere shapeSphere = null;
    @Tag(tag=2) public ShapeBox shapeBox = null;
}
