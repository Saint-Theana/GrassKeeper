package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonBrief {
    @Tag(tag=7) public CustomDungeonSetting setting = null;
    @Tag(tag=4) public Boolean isPsnPlatform = null;
    @Tag(tag=13) public CustomDungeonAbstract abstract_ = null;
    @Tag(tag=9) public Integer state = null;
    @Tag(tag=5) public Long dungeonGuid = null;
    @Tag(tag=15) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=10) public Integer lastSaveTime = null;
    @Tag(tag=8) public CustomDungeonSocial social = null;
    @Tag(tag=2) public Integer battleMinCostTime = null;
    @Tag(tag=6) public Integer dungeonId = null;
}
