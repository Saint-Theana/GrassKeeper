package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionStartReq {
    public enum ExpeditionStartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2020) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer assistAvatarId = null;
    @Tag(tag=10) public Integer pathId = null;
    @Tag(tag=8) public List<Integer> avatarIdList = new ArrayList<>();
    @Tag(tag=7) public Integer assistUid = null;
}
