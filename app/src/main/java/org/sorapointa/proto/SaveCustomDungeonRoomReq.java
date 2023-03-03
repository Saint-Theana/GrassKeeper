package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonRoom.*;
import org.sorapointa.proto.CustomDungeonRoom;
import org.sorapointa.proto.CustomDungeonSetting.*;
import org.sorapointa.proto.CustomDungeonSetting;

public class SaveCustomDungeonRoomReq {
    @Tag(tag=5) public CustomDungeonRoom customDungeonRoom = null;
    @Tag(tag=7) public Boolean isUpdateSetting = null;
    @Tag(tag=13) public CustomDungeonSetting setting = null;
}
