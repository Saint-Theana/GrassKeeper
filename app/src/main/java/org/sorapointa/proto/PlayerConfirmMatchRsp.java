package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerConfirmMatchRsp {
    public enum PlayerConfirmMatchRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4166) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Boolean isAgreed = null;
    @Tag(tag=12) public Integer matchType = null;
    @Tag(tag=3) public Integer matchId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
