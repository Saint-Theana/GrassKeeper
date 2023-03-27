package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallengeDataNotify {
    public enum ChallengeDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1000) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer paramIndex = null;
    @Tag(tag=11) public Integer value = null;
    @Tag(tag=8) public Integer challengeIndex = null;
}
