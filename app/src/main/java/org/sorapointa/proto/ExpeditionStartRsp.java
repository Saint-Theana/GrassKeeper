package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionStartRsp {
    public enum ExpeditionStartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2157) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer assistUid = null;
    @Tag(tag=9) public Integer assistAvatarId = null;
    @Tag(tag=4) public Integer pathId = null;
    @Tag(tag=12) public List<Integer> avatarIdList = new ArrayList<>();
}
