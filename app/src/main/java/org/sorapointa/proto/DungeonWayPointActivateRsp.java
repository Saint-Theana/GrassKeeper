package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonWayPointActivateRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer wayPointId = null;
}
