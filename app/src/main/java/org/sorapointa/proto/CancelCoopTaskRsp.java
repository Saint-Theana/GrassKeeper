package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CancelCoopTaskRsp {
    public enum CancelCoopTaskRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1965) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer chapterId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
