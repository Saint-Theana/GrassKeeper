package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonSetting.*;
import org.sorapointa.proto.CustomDungeonSetting;
import org.sorapointa.proto.CustomDungeonRoom.*;
import org.sorapointa.proto.CustomDungeonRoom;

public class CustomDungeon {
    @Tag(tag=8) public Long dungeonGuid = null;
    @Tag(tag=3) public List<CustomDungeonRoom> roomList = new ArrayList<>();
    @Tag(tag=1) public CustomDungeonSetting setting = null;
    @Tag(tag=4) public Integer dungeonId = null;
}
