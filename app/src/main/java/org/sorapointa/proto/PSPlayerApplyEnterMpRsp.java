package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PSPlayerApplyEnterMpRsp {
    public enum PSPlayerApplyEnterMpRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1814) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer param = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public String targetPsnId = null;
}
