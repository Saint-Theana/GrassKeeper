package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingGiveFriendPicReq {
    public enum BlessingGiveFriendPicReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2002) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer uid = null;
    @Tag(tag=8) public Integer picId = null;
}
