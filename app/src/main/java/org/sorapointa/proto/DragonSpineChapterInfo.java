package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineChapterInfo {
    @Tag(tag=7) public Integer finishedMissionNum = null;
    @Tag(tag=4) public Integer chapterId = null;
    @Tag(tag=6) public Boolean isOpen = null;
    @Tag(tag=8) public Integer progress = null;
    @Tag(tag=3) public Integer openTime = null;
}
