package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCInviteRsp {
    public enum MINOBCLFFCG {
        @Tag(tag=0) None ,
        @Tag(tag=7188) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer characterId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
