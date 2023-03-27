package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterChessDungeonRsp {
    public enum EnterChessDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8741) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer mapId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
