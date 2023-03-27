package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeaponAwakenReq {
    public static class MapAffixLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum WeaponAwakenReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=645) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public List<MapAffixLevelMap> affixLevelMap = new ArrayList<>();
    @Tag(tag=2) public Long itemGuid = null;
    @Tag(tag=9) public Long targetWeaponGuid = null;
}
