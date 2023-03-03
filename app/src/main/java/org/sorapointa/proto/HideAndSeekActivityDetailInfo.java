package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HideAndSeekMapInfo.*;
import org.sorapointa.proto.HideAndSeekMapInfo;

public class HideAndSeekActivityDetailInfo {
    @Tag(tag=1) public List<HideAndSeekMapInfo> openMapInfoList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> chosenHunterSkillList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> unlockMapList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> chosenHiderSkillList = new ArrayList<>();
}
