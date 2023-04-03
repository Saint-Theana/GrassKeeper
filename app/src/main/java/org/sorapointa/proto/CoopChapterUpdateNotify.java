package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopChapter.*;
import org.sorapointa.proto.CoopChapter;

public class CoopChapterUpdateNotify {
    public enum CoopChapterUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1985) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<CoopChapter> chapterList = new ArrayList<>();
}
