package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerSignatureRsp {
    public enum SetPlayerSignatureRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4069) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public String signature = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
