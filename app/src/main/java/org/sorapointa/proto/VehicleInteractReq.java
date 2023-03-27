package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VehicleInteractReq {
    public enum VehicleInteractReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=888) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer pos = null;
    @Tag(tag=11) public Integer interactType = null;
    @Tag(tag=13) public Integer entityId = null;
}
