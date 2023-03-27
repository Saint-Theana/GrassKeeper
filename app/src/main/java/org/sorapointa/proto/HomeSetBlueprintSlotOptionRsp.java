package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSetBlueprintSlotOptionRsp {
    public enum HAKCGBFOHIP {
        @Tag(tag=0) None ,
        @Tag(tag=4749) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer slotId = null;
    @Tag(tag=1) public Boolean isAllowCopy = null;
}
