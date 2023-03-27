package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessEquipCardRsp {
    public enum IrodoriChessEquipCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8312) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer levelId = null;
    @Tag(tag=8) public Boolean isHardMap = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer cardId = null;
}
