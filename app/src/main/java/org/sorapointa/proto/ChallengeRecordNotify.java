package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChallengeRecord.*;
import org.sorapointa.proto.ChallengeRecord;

public class ChallengeRecordNotify {
    public enum ChallengeRecordNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=958) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer groupId = null;
    @Tag(tag=5) public List<ChallengeRecord> challengeRecordList = new ArrayList<>();
}
