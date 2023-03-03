package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectAsterMidDifficultyRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=5) public Integer gadgetEntityId = null;
    @Tag(tag=14) public Integer difficultyId = null;
}
