package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonChallengeBeginNotify {
    @Tag(tag=5) public Integer fatherIndex = null;
    @Tag(tag=14) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=6) public Integer challengeIndex = null;
    @Tag(tag=1) public Integer challengeId = null;
    @Tag(tag=4) public Integer groupId = null;
    @Tag(tag=12) public List<Integer> uidList = new ArrayList<>();
}
