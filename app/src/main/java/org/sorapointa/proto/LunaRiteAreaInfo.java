package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunaRiteHintStatusType.*;
import org.sorapointa.proto.LunaRiteHintStatusType;

public class LunaRiteAreaInfo {
    @Tag(tag=11) public List<Integer> sacrificeList = new ArrayList<>();
    @Tag(tag=7) public Integer hintStatus = null;
    @Tag(tag=4) public List<Integer> sacrificeRewardList = new ArrayList<>();
    @Tag(tag=8) public Integer areaId = null;
    @Tag(tag=6) public Integer challengeIndex = null;
}
