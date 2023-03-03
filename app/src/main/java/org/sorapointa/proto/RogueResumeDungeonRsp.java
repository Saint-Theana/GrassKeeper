package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueResumeDungeonRsp {
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
