package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusConfirmCardReq {
    public enum InBattleMechanicusConfirmCardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5324) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer playIndex = null;
    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=9) public Integer cardId = null;
}
