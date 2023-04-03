package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ElectroherculesBattleStageInfo.*;
import org.sorapointa.proto.ElectroherculesBattleStageInfo;

public class ElectroherculesBattleInfo {
    @Tag(tag=7) public List<ElectroherculesBattleStageInfo> stageInfoList = new ArrayList<>();
    @Tag(tag=14) public Boolean pdpfimhpajd = null;
}
