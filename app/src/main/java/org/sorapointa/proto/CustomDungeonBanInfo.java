package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBanType.*;
import org.sorapointa.proto.CustomDungeonBanType;

public class CustomDungeonBanInfo {
    @Tag(tag=12) public Integer expireTime = null;
    @Tag(tag=6) public Integer banType = null;
    @Tag(tag=1) public Long dungeonGuid = null;
}
