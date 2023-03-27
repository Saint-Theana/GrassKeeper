package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineChapterOpenNotify {
    public enum DragonSpineChapterOpenNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2037) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer chapterId = null;
    @Tag(tag=8) public Integer scheduleId = null;
}
