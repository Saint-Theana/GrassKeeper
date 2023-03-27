package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPropNotify {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Long value = null;
    }

    public enum AvatarPropNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1224) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Long avatarGuid = null;
    @Tag(tag=11) public List<MapPropMap> propMap = new ArrayList<>();
}
