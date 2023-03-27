package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VehicleStaminaNotify {
    public enum VehicleStaminaNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=851) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=15,isFloat=true) public Float curStamina = null;
}
