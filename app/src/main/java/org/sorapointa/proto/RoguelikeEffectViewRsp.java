package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeEffectViewRsp {
    public enum RoguelikeEffectViewRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8645) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
