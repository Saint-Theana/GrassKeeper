package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowAvatarListReq {
    public enum UpdatePlayerShowAvatarListReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4064) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public List<Integer> showAvatarIdList = new ArrayList<>();
    @Tag(tag=4) public Boolean isShowAvatar = null;
}
