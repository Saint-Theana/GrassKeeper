package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartRsp {
    @Tag(tag=15) public Integer dungeonId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer pointId = null;
}
