package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;

public class DungeonPlayerDieReq {
    @Tag(tag=6) public Integer dieType = null;
    @Tag(tag=8) public Integer dungeonId = null;
}
