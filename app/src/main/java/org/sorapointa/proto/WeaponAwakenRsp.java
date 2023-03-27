package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeaponAwakenRsp {
    public static class MapOldAffixLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapCurAffixLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum WeaponAwakenRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=685) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer targetWeaponAwakenLevel = null;
    @Tag(tag=2) public Long targetWeaponGuid = null;
    @Tag(tag=5) public Long avatarGuid = null;
    @Tag(tag=6) public List<MapOldAffixLevelMap> oldAffixLevelMap = new ArrayList<>();
    @Tag(tag=12) public List<MapCurAffixLevelMap> curAffixLevelMap = new ArrayList<>();
}
