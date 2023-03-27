package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerSignatureReq {
    public enum SetPlayerSignatureReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4013) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public String signature = null;
}
