package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayLevelFinishNotify {
    @Tag(tag=11) public Boolean isNeedSwitchTeam = null;
    @Tag(tag=7) public Boolean isSkipBlackScreen = null;
    @Tag(tag=15) public Integer round = null;
    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=10) public Integer levelId = null;
}
