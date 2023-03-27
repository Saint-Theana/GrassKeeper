package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarLifeStateChangeNotify {
    public enum AvatarLifeStateChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1270) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer lifeState = null;
    @Tag(tag=10) public Integer moveReliableSeq = null;
    @Tag(tag=1) public Integer dieType = null;
    @Tag(tag=6) public String attackTag = null;
    @Tag(tag=3) public Long avatarGuid = null;
    @Tag(tag=5) public Integer sourceEntityId = null;
    @Tag(tag=4) public List<ServerBuff> serverBuffList = new ArrayList<>();
}
