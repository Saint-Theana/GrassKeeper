package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEnterPosInfo.*;
import org.sorapointa.proto.DungeonEnterPosInfo;

public class PlayerEnterDungeonReq {
    @Tag(tag=2) public DungeonEnterPosInfo enterPosInfo = null;
    @Tag(tag=13) public Integer pointId = null;
    @Tag(tag=7) public Integer dungeonId = null;
}
