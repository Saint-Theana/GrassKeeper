package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFetterDataNotify {
    public static class MapFetterInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarFetterInfo value = null;
    }

    public enum AvatarFetterDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1772) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<MapFetterInfoMap> fetterInfoMap = new ArrayList<>();
}
