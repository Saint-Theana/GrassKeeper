package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SignInInfo.*;
import org.sorapointa.proto.SignInInfo;

public class GetSignInRewardRsp {
    public enum GetSignInRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2574) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public SignInInfo signInInfo = null;
}
