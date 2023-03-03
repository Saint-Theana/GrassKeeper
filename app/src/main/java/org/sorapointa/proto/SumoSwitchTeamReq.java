package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoSwitchTeamReq {
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=5) public Integer activityId = null;
}
