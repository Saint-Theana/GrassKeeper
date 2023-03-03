package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopChapter.*;
import org.sorapointa.proto.CoopChapter;

public class CoopDataNotify {
    @Tag(tag=15) public List<CoopChapter> chapterList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> viewedChapterList = new ArrayList<>();
    @Tag(tag=10) public Boolean isHaveProgress = null;
    @Tag(tag=5) public Integer curCoopPoint = null;
}
