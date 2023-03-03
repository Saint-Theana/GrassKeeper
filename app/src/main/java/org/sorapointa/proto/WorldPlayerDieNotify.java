package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;

public class WorldPlayerDieNotify {
    @Tag(tag=12) public Integer dieType = null;
    @Tag(tag=15) public Integer murdererEntityId = null;
    @Tag(tag=8) public Integer monsterId = null;
    @Tag(tag=4) public Integer gadgetId = null;
}
