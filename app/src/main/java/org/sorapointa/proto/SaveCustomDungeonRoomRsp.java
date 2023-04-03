package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBlock.*;
import org.sorapointa.proto.CustomDungeonBlock;

public class SaveCustomDungeonRoomRsp {
    public enum SaveCustomDungeonRoomRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6241) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<CustomDungeonBlock> errorBlockList = new ArrayList<>();
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer roomId = null;
}
