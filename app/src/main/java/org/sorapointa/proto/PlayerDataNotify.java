package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PropValue.*;
import org.sorapointa.proto.PropValue;

public class PlayerDataNotify {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public PropValue value = null;
    }

    @Tag(tag=7) public Long serverTime = null;
    @Tag(tag=8) public String nickName = null;
    @Tag(tag=12) public Boolean isFirstLoginToday = null;
    @Tag(tag=6) public Integer regionId = null;
    @Tag(tag=15) public List<MapPropMap> propMap = new ArrayList<>();
}
