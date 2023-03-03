package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BounceConjuringChapterInfo.*;
import org.sorapointa.proto.BounceConjuringChapterInfo;

public class BounceConjuringActivityDetailInfo {
    @Tag(tag=8) public List<BounceConjuringChapterInfo> chapterInfoList = new ArrayList<>();
    @Tag(tag=12) public Boolean isContentClosed = null;
    @Tag(tag=7) public Integer contentCloseTime = null;
}
