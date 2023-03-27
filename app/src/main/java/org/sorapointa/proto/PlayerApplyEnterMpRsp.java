package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpRsp {
    public enum PlayerApplyEnterMpRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1846) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer param = null;
    @Tag(tag=10) public Integer targetUid = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
