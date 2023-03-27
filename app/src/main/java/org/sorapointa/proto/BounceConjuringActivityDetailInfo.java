package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BounceConjuringActivityDetailInfo {
    @Tag(tag=1) public Integer contentCloseTime = null;
    @Tag(tag=6) public Boolean isContentClosed = null;
    @Tag(tag=7) public List<BounceConjuringChapterInfo> chapterInfoList = new ArrayList<>();
}
