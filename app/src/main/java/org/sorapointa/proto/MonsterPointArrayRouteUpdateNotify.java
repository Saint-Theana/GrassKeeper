package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MonsterRoute.*;
import org.sorapointa.proto.MonsterRoute;

public class MonsterPointArrayRouteUpdateNotify {
    public enum MonsterPointArrayRouteUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3271) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=2) public MonsterRoute monsterRoute = null;
}
