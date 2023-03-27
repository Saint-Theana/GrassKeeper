package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardData {
    @Tag(tag=7) public Integer cardId = null;
    @Tag(tag=15) public List<Integer> proficiencyRewardTakenIdxList = new ArrayList<>();
    @Tag(tag=2) public Integer faceType = null;
    @Tag(tag=4) public Integer num = null;
    @Tag(tag=12) public Integer proficiency = null;
    @Tag(tag=10) public List<Integer> unlockFaceTypeList = new ArrayList<>();
}
