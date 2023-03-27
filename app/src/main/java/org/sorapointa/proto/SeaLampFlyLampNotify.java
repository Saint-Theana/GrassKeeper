package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampFlyLampNotify {
    public enum SeaLampFlyLampNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2014) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer itemNum = null;
    @Tag(tag=5) public Vector pos = null;
    @Tag(tag=10,isSigned=true) public Integer param = null;
    @Tag(tag=3) public Integer itemId = null;
}
