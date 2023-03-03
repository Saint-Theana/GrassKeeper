package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryCond.*;
import org.sorapointa.proto.DungeonEntryCond;

public class GetDungeonEntryExploreConditionRsp {
    @Tag(tag=5) public DungeonEntryCond dungeonEntryCond = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
