package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterLevelDetailInfo {
    @Tag(tag=1) public Boolean isFinish = null;
    @Tag(tag=2) public Integer difficulty = null;
    @Tag(tag=8) public Integer minFinishTime = null;
    @Tag(tag=7) public Boolean isHaveTry = null;
}
