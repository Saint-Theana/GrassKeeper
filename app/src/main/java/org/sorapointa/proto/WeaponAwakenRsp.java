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

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Long avatarGuid = null;
    @Tag(tag=4) public List<MapOldAffixLevelMap> oldAffixLevelMap = new ArrayList<>();
    @Tag(tag=2) public Integer targetWeaponAwakenLevel = null;
    @Tag(tag=15) public Long targetWeaponGuid = null;
    @Tag(tag=11) public List<MapCurAffixLevelMap> curAffixLevelMap = new ArrayList<>();
}
