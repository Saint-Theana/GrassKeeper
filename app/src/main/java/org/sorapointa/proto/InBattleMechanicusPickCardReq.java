package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusPickCardReq {
    public enum InBattleMechanicusPickCardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5370) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer groupId = null;
    @Tag(tag=11) public Integer cardId = null;
    @Tag(tag=4) public Integer playIndex = null;
}
