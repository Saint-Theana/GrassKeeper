package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAvatarLockChairRsp {
    public enum EvtAvatarLockChairRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=384) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Vector position = null;
    @Tag(tag=15) public Long chairId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer entityId = null;
}
