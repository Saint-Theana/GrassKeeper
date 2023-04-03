package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeAvatarTalkFinishInfo.*;
import org.sorapointa.proto.HomeAvatarTalkFinishInfo;

public class HomeAvatarTalkFinishInfoNotify {
    public enum HomeAvatarTalkFinishInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4718) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<HomeAvatarTalkFinishInfo> avatarTalkInfoList = new ArrayList<>();
}
