package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerBornDataReq {
    public enum SetPlayerBornDataReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=169) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public String nickName = null;
    @Tag(tag=15) public Integer avatarId = null;
}
