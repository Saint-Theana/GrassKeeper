package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceStageData {
    @Tag(tag=10) public Boolean isOpen = null;
    @Tag(tag=3) public Integer successTimes = null;
    @Tag(tag=9) public Integer stageId = null;
}
