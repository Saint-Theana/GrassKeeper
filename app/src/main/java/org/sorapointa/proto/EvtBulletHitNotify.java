package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtBulletHitNotify {
    public enum EvtBulletHitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=378) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Vector hitNormal = null;
    @Tag(tag=14) public Integer hitEntityId = null;
    @Tag(tag=15,isSigned=true) public Integer hitBoxIndex = null;
    @Tag(tag=6) public Integer forwardType = null;
    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=13) public Integer forwardPeer = null;
    @Tag(tag=12) public Integer singleBulletId = null;
    @Tag(tag=8) public Integer hitColliderType = null;
    @Tag(tag=1) public Vector hitPoint = null;
}
