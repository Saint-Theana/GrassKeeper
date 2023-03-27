package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UgcActivityDetailInfo {
    @Tag(tag=5) public Boolean isUgcFeatureClosed = null;
    @Tag(tag=10) public List<OfficialCustomDungeon> officialCustomDungeonList = new ArrayList<>();
    @Tag(tag=15) public Boolean isEnableUgc = null;
    @Tag(tag=3) public Integer customDungeonGroupId = null;
}
