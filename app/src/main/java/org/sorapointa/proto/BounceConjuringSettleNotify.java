package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BounceConjuringSettleNotify {
    public static class MapSettleInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public BounceConjuringGallerySettleInfo value = null;
    }

    public enum BounceConjuringSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8552) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Boolean isNewRecord = null;
    @Tag(tag=7) public List<MapSettleInfoMap> settleInfoMap = new ArrayList<>();
    @Tag(tag=11) public Integer chapterId = null;
    @Tag(tag=4) public Integer totalScore = null;
}
