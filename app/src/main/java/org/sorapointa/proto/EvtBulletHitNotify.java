package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.HitColliderType.*;
import org.sorapointa.proto.HitColliderType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtBulletHitNotify {
    @Tag(tag=8) public Integer singleBulletId = null;
    @Tag(tag=15) public Vector hitPoint = null;
    @Tag(tag=11) public Vector hitNormal = null;
    @Tag(tag=9,isSigned=true) public Integer hitBoxIndex = null;
    @Tag(tag=3) public Integer hitEntityId = null;
    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=7) public Integer forwardPeer = null;
    @Tag(tag=2) public Integer forwardType = null;
    @Tag(tag=6) public Integer hitColliderType = null;
}
