package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdateAbilityCreatedMovingPlatformNotify {
    public enum UpdateAbilityCreatedMovingPlatformNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=813) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=6) public Integer opType = null;
}
