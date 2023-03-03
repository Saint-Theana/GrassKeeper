package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AsterLittleStageState.*;
import org.sorapointa.proto.AsterLittleStageState;

public class AsterLittleDetailInfo {
    @Tag(tag=4) public Boolean isOpen = null;
    @Tag(tag=7) public Integer stageState = null;
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=6) public Integer beginTime = null;
    @Tag(tag=5) public Integer stageBeginTime = null;
}
