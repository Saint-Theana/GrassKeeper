package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectRoguelikeDungeonCardRsp {
    public enum SelectRoguelikeDungeonCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8445) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer cardId = null;
}
