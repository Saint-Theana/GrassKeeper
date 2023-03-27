package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SignInInfoRsp {
    public enum SignInInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2598) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public List<SignInInfo> signInInfoList = new ArrayList<>();
}
