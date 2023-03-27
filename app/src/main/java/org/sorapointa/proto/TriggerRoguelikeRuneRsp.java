package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TriggerRoguelikeRuneRsp {
    public enum TriggerRoguelikeRuneRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8390) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer availableCount = null;
    @Tag(tag=2) public Integer runeId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
