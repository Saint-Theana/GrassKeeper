package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ElectroherculesBattleSelectDifficultyReq {
    public enum KPBAMNMPGKI {
        @Tag(tag=0) None ,
        @Tag(tag=23202) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer diffculty = null;
    @Tag(tag=10) public Integer stageId = null;
}
