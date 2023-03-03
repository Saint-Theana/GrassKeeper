package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChapterState.*;
import org.sorapointa.proto.ChapterState;

public class ChapterStateNotify {
    public static class NeedPlayerLevel {
        @Tag(tag=2) public Boolean isLimit = null;
        @Tag(tag=11) public Integer configNeedPlayerLevel = null;
    }

    public static class NeedBeginTime {
        @Tag(tag=3) public Integer configNeedBeginTime = null;
        @Tag(tag=7) public Boolean isLimit = null;
    }

    @Tag(tag=9) public Integer chapterState = null;
    @Tag(tag=10) public NeedPlayerLevel needPlayerLevel = null;
    @Tag(tag=1) public NeedBeginTime needBeginTime = null;
    @Tag(tag=2) public Integer chapterId = null;
}
