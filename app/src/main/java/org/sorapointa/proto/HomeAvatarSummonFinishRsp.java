package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonFinishRsp {
    public enum HomeAvatarSummonFinishRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4657) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer eventId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
