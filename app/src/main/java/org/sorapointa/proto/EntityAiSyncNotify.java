package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityAiSyncNotify {
    public enum EntityAiSyncNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=354) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<Integer> localAvatarAlertedMonsterList = new ArrayList<>();
    @Tag(tag=10) public List<AiSyncInfo> infoList = new ArrayList<>();
}
