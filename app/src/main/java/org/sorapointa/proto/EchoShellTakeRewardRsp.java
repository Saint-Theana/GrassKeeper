package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EchoShellTakeRewardRsp {
    public enum EchoShellTakeRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8180) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer rewardId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
