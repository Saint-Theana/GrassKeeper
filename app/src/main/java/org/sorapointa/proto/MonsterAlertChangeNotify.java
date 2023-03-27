package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MonsterAlertChangeNotify {
    public enum MonsterAlertChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=322) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer avatarEntityId = null;
    @Tag(tag=10) public Integer isAlert = null;
    @Tag(tag=15) public List<Integer> monsterEntityList = new ArrayList<>();
}
