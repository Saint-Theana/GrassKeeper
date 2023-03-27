package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeKickPlayerRsp {
    public enum HomeKickPlayerRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4883) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Boolean isKickAll = null;
    @Tag(tag=5) public Integer targetUid = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
