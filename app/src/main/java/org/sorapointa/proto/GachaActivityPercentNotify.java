package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaActivityPercentNotify {
    public static class MapTargetNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum GachaActivityPercentNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8200) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<MapTargetNumMap> targetNumMap = new ArrayList<>();
    @Tag(tag=13) public Integer subItemStage = null;
    @Tag(tag=14) public Integer itemStage = null;
    @Tag(tag=15) public Integer percent = null;
}
