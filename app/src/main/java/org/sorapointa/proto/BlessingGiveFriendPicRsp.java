package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingGiveFriendPicRsp {
    public enum BlessingGiveFriendPicRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2082) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer uid = null;
    @Tag(tag=15) public Integer picId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
