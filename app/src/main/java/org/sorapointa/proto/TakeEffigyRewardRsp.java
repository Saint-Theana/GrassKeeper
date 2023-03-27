package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeEffigyRewardRsp {
    public enum TakeEffigyRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2180) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer rewardIndex = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
