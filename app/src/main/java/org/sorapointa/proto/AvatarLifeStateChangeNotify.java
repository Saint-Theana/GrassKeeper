package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class AvatarLifeStateChangeNotify {
    @Tag(tag=13) public Integer lifeState = null;
    @Tag(tag=10) public String attackTag = null;
    @Tag(tag=2) public Integer dieType = null;
    @Tag(tag=12) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=5) public Integer moveReliableSeq = null;
    @Tag(tag=3) public Integer sourceEntityId = null;
    @Tag(tag=11) public Long avatarGuid = null;
}
