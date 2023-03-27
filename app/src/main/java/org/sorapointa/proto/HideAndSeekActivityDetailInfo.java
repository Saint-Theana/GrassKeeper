package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekActivityDetailInfo {
    @Tag(tag=5) public List<Integer> chosenMapList = new ArrayList<>();
    @Tag(tag=3) public List<Integer> chosenHiderSkillList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> unlockMapList = new ArrayList<>();
    @Tag(tag=4) public List<HideAndSeekMapInfo> openMapInfoList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> chosenHunterSkillList = new ArrayList<>();
}
