package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriEditFlowerCombinationRsp {
    public enum IrodoriEditFlowerCombinationRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8542) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Boolean isAlreadyFinished = null;
    @Tag(tag=1) public Boolean isCanTakeReward = null;
}
