package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivitySelectAvatarCardRsp {
    public enum ActivitySelectAvatarCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2154) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer rewardId = null;
    @Tag(tag=1) public Integer activityId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
