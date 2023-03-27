package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessUnequipCardReq {
    public enum IrodoriChessUnequipCardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8610) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer cardId = null;
    @Tag(tag=5) public Boolean isHardMap = null;
    @Tag(tag=7) public Integer levelId = null;
}
