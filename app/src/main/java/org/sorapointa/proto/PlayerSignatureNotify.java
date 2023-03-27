package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerSignatureNotify {
    public enum PlayerSignatureNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4012) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public String signature = null;
}
