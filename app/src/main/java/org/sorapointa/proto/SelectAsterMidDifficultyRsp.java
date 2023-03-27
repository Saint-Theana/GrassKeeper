package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectAsterMidDifficultyRsp {
    public enum SelectAsterMidDifficultyRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2139) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer gadgetEntityId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer difficultyId = null;
    @Tag(tag=8) public Integer scheduleId = null;
}
