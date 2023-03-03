package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OfficialCustomDungeon.*;
import org.sorapointa.proto.OfficialCustomDungeon;

public class UgcActivityDetailInfo {
    @Tag(tag=10) public Boolean isUgcFeatureClosed = null;
    @Tag(tag=12) public Integer customDungeonGroupId = null;
    @Tag(tag=5) public List<OfficialCustomDungeon> officialCustomDungeonList = new ArrayList<>();
    @Tag(tag=11) public Boolean isEnableUgc = null;
}
