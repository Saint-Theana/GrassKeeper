package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BounceConjuringGallerySettleInfo.*;
import org.sorapointa.proto.BounceConjuringGallerySettleInfo;

public class BounceConjuringSettleNotify {
    public static class MapSettleInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public BounceConjuringGallerySettleInfo value = null;
    }

    @Tag(tag=14) public Boolean isNewRecord = null;
    @Tag(tag=4) public List<MapSettleInfoMap> settleInfoMap = new ArrayList<>();
    @Tag(tag=2) public Integer totalScore = null;
    @Tag(tag=13) public Integer chapterId = null;
}
