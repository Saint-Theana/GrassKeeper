package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAllUnlockedBgmIdListNotify {
    public enum HomeAllUnlockedBgmIdListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4563) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Integer> allUnlockedBgmIdList = new ArrayList<>();
}
