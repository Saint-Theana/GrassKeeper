package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusUnlockGearReq {
    public enum MechanicusUnlockGearReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3980) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer mechanicusId = null;
    @Tag(tag=1) public Integer gearId = null;
}
