package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternProjectionLevelInfo {
    @Tag(tag=1) public Integer minFinishTime = null;
    @Tag(tag=2) public Integer id = null;
    @Tag(tag=7) public Boolean isFinished = null;
    @Tag(tag=9) public Boolean isCanStart = null;
    @Tag(tag=10) public Boolean isShowTips = null;
}
