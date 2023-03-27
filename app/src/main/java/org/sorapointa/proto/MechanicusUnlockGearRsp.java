package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusUnlockGearRsp {
    public enum MechanicusUnlockGearRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3970) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer gearId = null;
    @Tag(tag=13) public Integer mechanicusId = null;
}
