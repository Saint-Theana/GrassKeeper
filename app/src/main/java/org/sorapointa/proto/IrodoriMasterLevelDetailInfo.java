package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterLevelDetailInfo {
    @Tag(tag=6) public Boolean isFinish = null;
    @Tag(tag=5) public Boolean isHaveTry = null;
    @Tag(tag=14) public Integer minFinishTime = null;
    @Tag(tag=3) public Integer diffculty = null;
}
