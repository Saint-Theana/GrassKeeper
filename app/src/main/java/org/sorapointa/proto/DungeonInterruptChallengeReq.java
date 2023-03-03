package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonInterruptChallengeReq {
    @Tag(tag=14) public Integer challengeIndex = null;
    @Tag(tag=13) public Integer groupId = null;
    @Tag(tag=11) public Integer challengeId = null;
}
