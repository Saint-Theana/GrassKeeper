package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TryCustomDungeonType.*;
import org.sorapointa.proto.TryCustomDungeonType;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;

public class CustomDungeonOfficialNotify {
    public enum CustomDungeonOfficialNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6236) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer tryType = null;
    @Tag(tag=12) public List<Integer> officialBlackCoinList = new ArrayList<>();
    @Tag(tag=11) public Integer enterType = null;
}
