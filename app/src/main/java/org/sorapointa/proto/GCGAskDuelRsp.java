package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGAskDuelRsp {
    public enum BJKEODEOFEE {
        @Tag(tag=0) None ,
        @Tag(tag=7928) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public GCGDuel duel = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
