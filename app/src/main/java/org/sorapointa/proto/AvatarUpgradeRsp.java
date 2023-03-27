package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarUpgradeRsp {
    public static class MapCurFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    public static class MapOldFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    public enum AvatarUpgradeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1788) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<MapCurFightPropMap> curFightPropMap = new ArrayList<>();
    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=14) public List<MapOldFightPropMap> oldFightPropMap = new ArrayList<>();
    @Tag(tag=15) public Integer oldLevel = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer curLevel = null;
}
