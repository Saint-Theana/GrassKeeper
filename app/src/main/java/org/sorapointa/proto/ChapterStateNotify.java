package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChapterState.*;
import org.sorapointa.proto.ChapterState;

public class ChapterStateNotify {
    public static class ChapterStateNotify_NeedPlayerLevel {
        @Tag(tag=4) public Integer configNeedPlayerLevel = null;
        @Tag(tag=14) public Boolean isLimit = null;
    }

    public static class ChapterStateNotify_NeedBeginTime {
        @Tag(tag=5) public Integer configNeedBeginTime = null;
        @Tag(tag=4) public Boolean isLimit = null;
    }

    public enum ChapterStateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=469) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public ChapterStateNotify_NeedPlayerLevel needPlayerLevel = null;
    @Tag(tag=9) public ChapterStateNotify_NeedBeginTime needBeginTime = null;
    @Tag(tag=13) public Integer chapterState = null;
    @Tag(tag=15) public Integer chapterId = null;
}
