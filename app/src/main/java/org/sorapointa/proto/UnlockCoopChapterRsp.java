package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockCoopChapterRsp {
    public enum UnlockCoopChapterRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1990) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer chapterId = null;
}
