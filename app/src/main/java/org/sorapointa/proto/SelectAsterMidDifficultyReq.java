package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectAsterMidDifficultyReq {
    public enum SelectAsterMidDifficultyReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2128) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer gadgetEntityId = null;
    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=14) public Integer difficultyId = null;
}
