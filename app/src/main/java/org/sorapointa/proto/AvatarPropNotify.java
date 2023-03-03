package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPropNotify {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Long value = null;
    }

    @Tag(tag=14) public List<MapPropMap> propMap = new ArrayList<>();
    @Tag(tag=15) public Long avatarGuid = null;
}
