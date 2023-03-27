package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveCustomDungeonRoomReq {
    public enum SaveCustomDungeonRoomReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6246) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public CustomDungeonSetting setting = null;
    @Tag(tag=15) public CustomDungeonRoom customDungeonRoom = null;
    @Tag(tag=3) public Boolean isUpdateSetting = null;
}
