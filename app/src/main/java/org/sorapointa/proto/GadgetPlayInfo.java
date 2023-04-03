package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrucibleInfo.*;
import org.sorapointa.proto.CrucibleInfo;

public class GadgetPlayInfo {
    @Tag(tag=1) public Integer playType = null;
    @Tag(tag=2) public Integer duration = null;
    @Tag(tag=3) public List<Integer> progressStageList = new ArrayList<>();
    @Tag(tag=4) public Integer startCd = null;
    @Tag(tag=5) public Integer startTime = null;
    @Tag(tag=6) public Integer progress = null;
    @Tag(tag=21) public CrucibleInfo crucibleInfo = null;
}
