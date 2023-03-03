package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineChapterInfo {
    @Tag(tag=14) public Integer progress = null;
    @Tag(tag=6) public Integer openTime = null;
    @Tag(tag=11) public Boolean isOpen = null;
    @Tag(tag=9) public Integer chapterId = null;
    @Tag(tag=10) public Integer finishedMissionNum = null;
}
