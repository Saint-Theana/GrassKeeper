package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionWatcherRewardReq {
    @Tag(tag=12) public Integer watcherId = null;
    @Tag(tag=15) public Integer missionId = null;
}
