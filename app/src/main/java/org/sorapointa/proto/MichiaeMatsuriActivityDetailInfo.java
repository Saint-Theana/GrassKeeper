package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MichiaeMatsuriChallengePositionInfo.*;
import org.sorapointa.proto.MichiaeMatsuriChallengePositionInfo;
import org.sorapointa.proto.MichiaeMatsuriChestPositionInfo.*;
import org.sorapointa.proto.MichiaeMatsuriChestPositionInfo;
import org.sorapointa.proto.MichiaeMatsuriStage.*;
import org.sorapointa.proto.MichiaeMatsuriStage;

public class MichiaeMatsuriActivityDetailInfo {
    @Tag(tag=6) public List<MichiaeMatsuriChallengePositionInfo> challengePosList = new ArrayList<>();
    @Tag(tag=13) public Integer gainCrystalExp = null;
    @Tag(tag=2) public List<Integer> unlockedCrystalSkillList = new ArrayList<>();
    @Tag(tag=10) public List<MichiaeMatsuriChestPositionInfo> chestPosList = new ArrayList<>();
    @Tag(tag=14) public List<MichiaeMatsuriStage> stageList = new ArrayList<>();
}
