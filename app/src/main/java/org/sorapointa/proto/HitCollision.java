package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HitCollision {
    @Tag(tag=12,isFloat=true) public Float attackeeHitEntityAngle = null;
    @Tag(tag=4) public Vector hitDir = null;
    @Tag(tag=3) public Vector hitPoint = null;
    @Tag(tag=10,isSigned=true) public Integer hitBoxIndex = null;
    @Tag(tag=15,isFloat=true) public Float attackeeHitForceAngle = null;
    @Tag(tag=9) public Integer hitColliderType = null;
}
