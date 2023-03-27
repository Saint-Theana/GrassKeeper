package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonRecoverNotify {
    public enum CustomDungeonRecoverNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6233) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer tryType = null;
    @Tag(tag=10) public Integer enterType = null;
    @Tag(tag=14) public List<Integer> officialBlackCoinList = new ArrayList<>();
    @Tag(tag=3) public CustomDungeon customDungeon = null;
}
