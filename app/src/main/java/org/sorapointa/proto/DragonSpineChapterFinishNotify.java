package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineChapterFinishNotify {
    public enum DragonSpineChapterFinishNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2132) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer scheduleId = null;
    @Tag(tag=2) public Integer weaponEnhanceLevel = null;
    @Tag(tag=9) public Integer chapterId = null;
}
