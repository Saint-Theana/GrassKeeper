package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunaRiteHintStatusType.*;
import org.sorapointa.proto.LunaRiteHintStatusType;

public class LunaRiteAreaInfo {
    @Tag(tag=9) public Integer challengeIndex = null;
    @Tag(tag=13) public List<Integer> sacrificeRewardList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> sacrificeList = new ArrayList<>();
    @Tag(tag=3) public Integer hintStatus = null;
    @Tag(tag=12) public Integer areaId = null;
}
