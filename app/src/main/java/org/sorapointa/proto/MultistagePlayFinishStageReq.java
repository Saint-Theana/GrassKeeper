package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayFinishStageReq {
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=15) public Integer playIndex = null;
}
