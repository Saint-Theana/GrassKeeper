package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceStageData {
    @Tag(tag=12) public Boolean isOpen = null;
    @Tag(tag=1) public Integer successTimes = null;
    @Tag(tag=6) public Integer stageId = null;
}
