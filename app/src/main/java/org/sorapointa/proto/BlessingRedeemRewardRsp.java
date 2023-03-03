package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingRedeemRewardRsp {
    public static class MapPicNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=12) public List<MapPicNumMap> picNumMap = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
