package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class LifeStateChangeNotify {
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=6) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=7) public String attackTag = null;
    @Tag(tag=15) public Integer moveReliableSeq = null;
    @Tag(tag=14) public Integer dieType = null;
    @Tag(tag=5) public Integer lifeState = null;
    @Tag(tag=1) public Integer sourceEntityId = null;
}
