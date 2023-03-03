package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFightPropNotify {
    public static class MapFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    @Tag(tag=8) public List<MapFightPropMap> fightPropMap = new ArrayList<>();
    @Tag(tag=4) public Long avatarGuid = null;
}
