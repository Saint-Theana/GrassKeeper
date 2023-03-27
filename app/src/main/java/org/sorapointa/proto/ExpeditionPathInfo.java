package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionPathInfo {
    @Tag(tag=15) public Integer startTime = null;
    @Tag(tag=7) public Integer markId = null;
    @Tag(tag=11) public Integer pathId = null;
    @Tag(tag=2) public List<Integer> avatarIdList = new ArrayList<>();
    @Tag(tag=3) public Integer challengeId = null;
    @Tag(tag=9) public Integer state = null;
    @Tag(tag=10) public Integer assistAvatarId = null;
    @Tag(tag=1) public Integer assistCostumeId = null;
    @Tag(tag=14) public Integer assistUid = null;
    @Tag(tag=8,isFloat=true) public Float bonusProbability = null;
}
