package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonBattleRecordNotify {
    @Tag(tag=13) public Integer minCostTime = null;
    @Tag(tag=12) public Long dungeonGuid = null;
}
