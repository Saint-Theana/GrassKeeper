package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillInfo {
    @Tag(tag=1) public Integer passCdTime = null;
    @Tag(tag=2) public List<Integer> fullCdTimeList = new ArrayList<>();
    @Tag(tag=3) public Integer maxChargeCount = null;
}
