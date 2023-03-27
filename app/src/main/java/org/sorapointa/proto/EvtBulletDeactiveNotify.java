package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtBulletDeactiveNotify {
    public enum EvtBulletDeactiveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=316) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=5) public Vector disappearPos = null;
    @Tag(tag=12) public Integer forwardType = null;
}
