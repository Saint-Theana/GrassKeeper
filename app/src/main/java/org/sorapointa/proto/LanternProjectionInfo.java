package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientInputType.*;
import org.sorapointa.proto.ClientInputType;
import org.sorapointa.proto.LanternProjectionLevelInfo.*;
import org.sorapointa.proto.LanternProjectionLevelInfo;

public class LanternProjectionInfo {
    @Tag(tag=12) public List<Integer> viewSwitchTipsList = new ArrayList<>();
    @Tag(tag=6) public List<LanternProjectionLevelInfo> levelList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> openStageList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> viewInputTipsList = new ArrayList<>();
}
