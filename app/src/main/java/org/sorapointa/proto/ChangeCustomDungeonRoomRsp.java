package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeCustomDungeonRoomRsp {
    public enum ChangeCustomDungeonRoomRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6216) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer roomId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
