package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionBriefInfoRsp {
    public enum ReunionBriefInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5095) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Boolean isActivate = null;
    @Tag(tag=8) public ReunionBriefInfo reunionBriefInfo = null;
}
