package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerCancelMatchRsp {
    public enum PlayerCancelMatchRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4169) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer matchType = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
