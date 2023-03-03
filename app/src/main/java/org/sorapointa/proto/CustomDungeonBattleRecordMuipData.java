package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonBattleRecordMuipData {
    @Tag(tag=1) public Long dungeonGuid = null;
    @Tag(tag=2) public Integer minCostTime = null;
}
