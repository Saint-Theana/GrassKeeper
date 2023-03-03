package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopChapter.*;
import org.sorapointa.proto.CoopChapter;

public class CoopChapterUpdateNotify {
    @Tag(tag=14) public List<CoopChapter> chapterList = new ArrayList<>();
}
