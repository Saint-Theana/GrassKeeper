package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonAbstract.*;
import org.sorapointa.proto.CustomDungeonAbstract;
import org.sorapointa.proto.CustomDungeonSetting.*;
import org.sorapointa.proto.CustomDungeonSetting;
import org.sorapointa.proto.CustomDungeonSocial.*;
import org.sorapointa.proto.CustomDungeonSocial;
import org.sorapointa.proto.CustomDungeonState.*;
import org.sorapointa.proto.CustomDungeonState;

public class CustomDungeonBrief {
    @Tag(tag=2) public CustomDungeonSetting setting = null;
    @Tag(tag=13) public Boolean isPsnPlatform = null;
    @Tag(tag=7) public CustomDungeonSocial social = null;
    @Tag(tag=10) public Long dungeonGuid = null;
    @Tag(tag=14) public Integer lastSaveTime = null;
    @Tag(tag=15) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=5) public Integer dungeonId = null;
    @Tag(tag=12) public Integer battleMinCostTime = null;
    @Tag(tag=1) public Integer state = null;
    @Tag(tag=4) public CustomDungeonAbstract abstract_ = null;
}
