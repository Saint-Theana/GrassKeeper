package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LifeStateChangeNotify {
    public enum LifeStateChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1255) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=2) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=5) public Integer moveReliableSeq = null;
    @Tag(tag=13) public String attackTag = null;
    @Tag(tag=15) public Integer sourceEntityId = null;
    @Tag(tag=9) public Integer lifeState = null;
    @Tag(tag=6) public Integer dieType = null;
}
