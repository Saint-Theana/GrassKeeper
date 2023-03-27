package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetInteractReq {
    public enum GadgetInteractReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=805) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer opType = null;
    @Tag(tag=14) public Boolean isUseCondenseResin = null;
    @Tag(tag=8) public Integer gadgetEntityId = null;
    @Tag(tag=15) public Integer gadgetId = null;
    @Tag(tag=7) public Integer resinCostType = null;
    @Tag(tag=6) public Integer uiInteractId = null;
}
