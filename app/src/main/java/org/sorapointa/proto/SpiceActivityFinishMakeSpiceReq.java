package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceActivityFinishMakeSpiceReq {
    @Tag(tag=4) public Integer leftTurns = null;
    @Tag(tag=9) public Boolean isSuccess = null;
    @Tag(tag=12) public List<Integer> leftMaterialIdList = new ArrayList<>();
    @Tag(tag=15) public Integer stageId = null;
}
