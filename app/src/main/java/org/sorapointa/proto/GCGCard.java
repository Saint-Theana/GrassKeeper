package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGCard {
    @Tag(tag=11) public List<Integer> skillIdList = new ArrayList<>();
    @Tag(tag=3) public List<GCGToken> tokenList = new ArrayList<>();
    @Tag(tag=2) public Integer controllerId = null;
    @Tag(tag=9) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=1) public Integer faceType = null;
    @Tag(tag=8) public Integer guid = null;
    @Tag(tag=14) public Integer id = null;
    @Tag(tag=13) public Boolean isShow = null;
    @Tag(tag=12) public List<GCGSkillLimitsInfo> skillLimitsList = new ArrayList<>();
}
