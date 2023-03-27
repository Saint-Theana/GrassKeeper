package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshBackgroundAvatarRsp {
    public static class MapHpFullTimeMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum RefreshBackgroundAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1720) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public List<MapHpFullTimeMap> hpFullTimeMap = new ArrayList<>();
}
