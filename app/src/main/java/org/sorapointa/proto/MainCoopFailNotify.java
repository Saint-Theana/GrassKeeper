package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MainCoopFailNotify {
    public enum MainCoopFailNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1976) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public String textmapId = null;
    @Tag(tag=13) public Integer chapterId = null;
}
