package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HitColliderType.*;
import org.sorapointa.proto.HitColliderType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HitCollision {
    @Tag(tag=8) public Integer hitColliderType = null;
    @Tag(tag=7) public Vector hitPoint = null;
    @Tag(tag=2,isFloat=true) public Float attackeeHitForceAngle = null;
    @Tag(tag=13) public Vector hitDir = null;
    @Tag(tag=15,isFloat=true) public Float attackeeHitEntityAngle = null;
    @Tag(tag=4,isSigned=true) public Integer hitBoxIndex = null;
}
