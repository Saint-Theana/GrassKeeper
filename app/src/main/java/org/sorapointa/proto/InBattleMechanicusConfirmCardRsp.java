package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusConfirmCardRsp {
    public enum InBattleMechanicusConfirmCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5329) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=11) public Integer playIndex = null;
    @Tag(tag=6) public Integer cardId = null;
}
