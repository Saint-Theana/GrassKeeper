package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectAsterMidDifficultyReq {
    @Tag(tag=13) public Integer gadgetEntityId = null;
    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=5) public Integer difficultyId = null;
}
