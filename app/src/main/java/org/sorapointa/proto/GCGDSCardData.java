package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardData {
    @Tag(tag=14) public Integer cardId = null;
    @Tag(tag=9) public List<Integer> unlockFaceTypeList = new ArrayList<>();
    @Tag(tag=12) public Integer num = null;
    @Tag(tag=8) public Integer proficiency = null;
    @Tag(tag=6) public Integer faceType = null;
}
