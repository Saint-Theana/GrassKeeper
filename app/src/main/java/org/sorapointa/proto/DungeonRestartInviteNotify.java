package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartInviteNotify {
    @Tag(tag=3) public Integer playerUid = null;
    @Tag(tag=15) public Integer cd = null;
    @Tag(tag=13) public Integer pointId = null;
    @Tag(tag=10) public Integer dungeonId = null;
}
