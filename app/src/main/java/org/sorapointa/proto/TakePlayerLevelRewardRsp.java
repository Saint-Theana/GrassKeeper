package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakePlayerLevelRewardRsp {
    public enum TakePlayerLevelRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=190) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer level = null;
    @Tag(tag=4) public Integer rewardId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
