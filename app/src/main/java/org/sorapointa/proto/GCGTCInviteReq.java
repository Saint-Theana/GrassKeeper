package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCInviteReq {
    public enum JHBAGBEDCLP {
        @Tag(tag=0) None ,
        @Tag(tag=7579) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer levelId = null;
    @Tag(tag=3) public Integer characterId = null;
}
