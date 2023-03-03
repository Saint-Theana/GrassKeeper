package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;

public class EnterCustomDungeonReq {
    @Tag(tag=11) public Long dungeonGuid = null;
    @Tag(tag=12) public Integer dungeonId = null;
    @Tag(tag=10) public Integer enterType = null;
}
