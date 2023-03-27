package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetFriendShowAvatarInfoRsp {
    public enum GetFriendShowAvatarInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4027) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<ShowAvatarInfo> showAvatarInfoList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer uid = null;
}
