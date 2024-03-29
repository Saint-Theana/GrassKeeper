package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionSearchInfo.*;
import org.sorapointa.proto.RegionSearchInfo;

public class RegionSearchNotify {
    public enum RegionSearchNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5638) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=15) public List<RegionSearchInfo> regionSearchList = new ArrayList<>();
}
