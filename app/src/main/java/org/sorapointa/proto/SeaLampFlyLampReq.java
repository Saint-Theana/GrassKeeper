package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampFlyLampReq {
    public enum SeaLampFlyLampReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2193) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Vector pos = null;
    @Tag(tag=4) public Integer itemId = null;
    @Tag(tag=1) public Integer itemNum = null;
    @Tag(tag=15,isSigned=true) public Integer param = null;
}
