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

public class MichiaeMatsuriInfo {
    @Tag(tag=8) public List<MichiaeMatsuriChallengePositionInfo> challengePosList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> unlockedCrystalSkillList = new ArrayList<>();
    @Tag(tag=5) public Integer gainCrystalExp = null;
    @Tag(tag=11) public List<MichiaeMatsuriChestPositionInfo> chestPosList = new ArrayList<>();
    @Tag(tag=7) public List<MichiaeMatsuriStage> stageList = new ArrayList<>();
}
