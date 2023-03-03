package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonRoom.*;
import org.sorapointa.proto.CustomDungeonRoom;
import org.sorapointa.proto.CustomDungeonSetting.*;
import org.sorapointa.proto.CustomDungeonSetting;

public class CustomDungeon {
    @Tag(tag=1) public CustomDungeonSetting setting = null;
    @Tag(tag=15) public List<CustomDungeonRoom> roomList = new ArrayList<>();
    @Tag(tag=3) public Integer dungeonId = null;
    @Tag(tag=10) public Long dungeonGuid = null;
}
