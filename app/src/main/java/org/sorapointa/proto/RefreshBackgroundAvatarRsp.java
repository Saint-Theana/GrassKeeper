package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshBackgroundAvatarRsp {
    public static class MapHpFullTimeMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public List<MapHpFullTimeMap> hpFullTimeMap = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
