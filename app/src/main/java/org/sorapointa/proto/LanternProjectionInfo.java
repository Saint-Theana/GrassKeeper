package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternProjectionInfo {
    @Tag(tag=2) public List<Integer> viewSwitchTipsList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> viewInputTipsList = new ArrayList<>();
    @Tag(tag=11) public List<LanternProjectionLevelInfo> levelList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> openStageList = new ArrayList<>();
}
