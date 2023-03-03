package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarUpgradeRsp {
    public static class MapOldFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    public static class MapCurFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    @Tag(tag=6) public Integer curLevel = null;
    @Tag(tag=13) public Integer oldLevel = null;
    @Tag(tag=10) public List<MapOldFightPropMap> oldFightPropMap = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public List<MapCurFightPropMap> curFightPropMap = new ArrayList<>();
    @Tag(tag=15) public Long avatarGuid = null;
}
