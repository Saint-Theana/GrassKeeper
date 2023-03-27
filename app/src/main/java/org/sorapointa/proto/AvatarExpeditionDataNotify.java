package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarExpeditionDataNotify {
    public static class MapExpeditionInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarExpeditionInfo value = null;
    }

    public enum AvatarExpeditionDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1638) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
}
