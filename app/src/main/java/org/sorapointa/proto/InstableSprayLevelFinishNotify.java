package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayLevelFinishNotify {
    public enum EOIABCFNAIK {
        @Tag(tag=0) None ,
        @Tag(tag=24172) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Boolean isSkipBlackScreen = null;
    @Tag(tag=2) public Integer round = null;
    @Tag(tag=11) public Integer stageId = null;
    @Tag(tag=9) public Integer levelId = null;
    @Tag(tag=6) public Boolean isNeedSwitchTeam = null;
}
