package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VehicleMember.*;
import org.sorapointa.proto.VehicleMember;
import org.sorapointa.proto.VehicleInteractType.*;
import org.sorapointa.proto.VehicleInteractType;

public class VehicleInteractRsp {
    public enum VehicleInteractRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=825) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public VehicleMember member = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer interactType = null;
}
