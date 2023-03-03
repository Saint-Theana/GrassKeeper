package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueDiaryPlayReq {
    @Tag(tag=1) public Integer difficulty = null;
    @Tag(tag=12) public Integer stageId = null;
}
