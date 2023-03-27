package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabStageActiveChallengeIndexNotify {
    public enum ChannelerSlabStageActiveChallengeIndexNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8354) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer activeCampIndex = null;
    @Tag(tag=8) public Integer challengeIndex = null;
    @Tag(tag=7) public Integer stageId = null;
}
