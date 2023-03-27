package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusPickCardRsp {
    public enum InBattleMechanicusPickCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5362) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer playIndex = null;
    @Tag(tag=13) public Integer groupId = null;
    @Tag(tag=5) public Integer cardId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
