package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceActivityGivingRecordNotify {
    public enum SpiceActivityGivingRecordNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8085) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer currentIncreaseAvatarFetterTimes = null;
    @Tag(tag=8) public Integer avatarId = null;
    @Tag(tag=4) public Integer increaseAvatarFetterLimitTimes = null;
}
