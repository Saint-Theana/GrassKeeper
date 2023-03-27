package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowAvatarListRsp {
    public enum UpdatePlayerShowAvatarListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4083) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<Integer> showAvatarIdList = new ArrayList<>();
    @Tag(tag=14) public Boolean isShowAvatar = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
