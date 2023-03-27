package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockPersonalLineRsp {
    public enum UnlockPersonalLineRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=403) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer personalLineId = null;
    @Tag(tag=3) public Integer level = null;
    @Tag(tag=14) public Integer chapterId = null;
}
