package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerSetOnlyMPWithPSPlayerRsp {
    public enum PlayerSetOnlyMPWithPSPlayerRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1840) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Boolean isOnly = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
