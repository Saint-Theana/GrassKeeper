package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineInfo {
    @Tag(tag=14) public Integer contentFinishTime = null;
    @Tag(tag=5) public Integer wondrousEssence = null;
    @Tag(tag=1) public Integer shimmeringEssence = null;
    @Tag(tag=7) public Integer warmEssence = null;
    @Tag(tag=2) public Boolean isContentClosed = null;
    @Tag(tag=9) public List<DragonSpineChapterInfo> chapterInfoList = new ArrayList<>();
    @Tag(tag=15) public Integer weaponEnhanceLevel = null;
}
