package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeNewUnlockedBgmIdListNotify {
    public enum HomeNewUnlockedBgmIdListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4732) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> newUnlockedBgmIdList = new ArrayList<>();
}
