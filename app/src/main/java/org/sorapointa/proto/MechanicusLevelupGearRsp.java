package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusLevelupGearRsp {
    public enum MechanicusLevelupGearRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3914) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer mechanicusId = null;
    @Tag(tag=10) public Integer gearId = null;
    @Tag(tag=9) public Integer afterGearLevel = null;
}
