package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DragonSpineChapterInfo.*;
import org.sorapointa.proto.DragonSpineChapterInfo;

public class DragonSpineActivityDetailInfo {
    @Tag(tag=10) public Boolean isContentClosed = null;
    @Tag(tag=4) public List<DragonSpineChapterInfo> chapterInfoList = new ArrayList<>();
    @Tag(tag=2) public Integer weaponEnhanceLevel = null;
    @Tag(tag=15) public Integer contentFinishTime = null;
    @Tag(tag=13) public Integer shimmeringEssence = null;
    @Tag(tag=11) public Integer warmEssence = null;
    @Tag(tag=7) public Integer wondrousEssence = null;
}
