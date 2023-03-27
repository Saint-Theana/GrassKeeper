package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterTrialAvatarActivityDungeonRsp {
    public enum EnterTrialAvatarActivityDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2046) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer trialAvatarIndexId = null;
    @Tag(tag=2) public Integer activityId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
