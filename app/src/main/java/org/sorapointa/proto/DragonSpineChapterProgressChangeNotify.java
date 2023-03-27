package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineChapterProgressChangeNotify {
    public enum DragonSpineChapterProgressChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2086) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer chapterId = null;
    @Tag(tag=5) public Integer curProgress = null;
    @Tag(tag=15) public Integer scheduleId = null;
}
