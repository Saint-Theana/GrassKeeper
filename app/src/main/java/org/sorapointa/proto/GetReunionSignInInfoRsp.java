package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetReunionSignInInfoRsp {
    public enum GetReunionSignInInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5093) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public ReunionSignInInfo signInInfo = null;
}
