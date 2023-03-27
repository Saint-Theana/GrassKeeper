package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCoopChapterViewedRsp {
    public enum SetCoopChapterViewedRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1961) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer chapterId = null;
}
