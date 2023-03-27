package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarAllFinishRewardNotify {
    public enum HomeAvatarAllFinishRewardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4503) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Integer> eventIdList = new ArrayList<>();
}
