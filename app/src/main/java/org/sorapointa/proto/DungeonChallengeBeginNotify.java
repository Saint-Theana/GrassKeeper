package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonChallengeBeginNotify {
    public enum DungeonChallengeBeginNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=939) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer challengeId = null;
    @Tag(tag=2) public Integer challengeIndex = null;
    @Tag(tag=6) public Integer groupId = null;
    @Tag(tag=7) public Integer fatherIndex = null;
    @Tag(tag=12) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> paramList = new ArrayList<>();
}
