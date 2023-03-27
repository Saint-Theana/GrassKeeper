package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoDungeonSettleNotify {
    public enum SumoDungeonSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8830) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer killEliteMonsterNum = null;
    @Tag(tag=3) public Integer stageId = null;
    @Tag(tag=15) public Boolean isNewRecord = null;
    @Tag(tag=4) public Integer killMonsterNum = null;
    @Tag(tag=2) public Integer difficultyId = null;
    @Tag(tag=11) public Integer finalScore = null;
}
