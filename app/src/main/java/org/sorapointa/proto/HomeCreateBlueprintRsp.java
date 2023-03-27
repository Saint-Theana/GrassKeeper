package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeCreateBlueprintRsp {
    public enum FICBDNICILH {
        @Tag(tag=0) None ,
        @Tag(tag=4765) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public HomeBlueprintSlotInfo slotInfo = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
