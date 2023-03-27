package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerReportRsp {
    public enum PlayerReportRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4036) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer cdTime = null;
    @Tag(tag=4) public Integer targetUid = null;
}
