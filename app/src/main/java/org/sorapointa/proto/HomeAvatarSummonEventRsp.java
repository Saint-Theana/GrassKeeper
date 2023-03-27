package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonEventRsp {
    public enum HomeAvatarSummonEventRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4696) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer eventId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
