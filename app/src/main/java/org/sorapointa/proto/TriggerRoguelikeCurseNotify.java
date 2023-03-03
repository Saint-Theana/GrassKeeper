package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TriggerRoguelikeCurseNotify {
    @Tag(tag=14) public List<Integer> effectParamList = new ArrayList<>();
    @Tag(tag=9) public Integer curseGroupId = null;
    @Tag(tag=13) public Boolean isTriggerCurse = null;
    @Tag(tag=3) public Integer curseLevel = null;
}
