package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VehicleInteractType.*;
import org.sorapointa.proto.VehicleInteractType;
import org.sorapointa.proto.VehicleMember.*;
import org.sorapointa.proto.VehicleMember;

public class VehicleInteractRsp {
    @Tag(tag=15) public Integer interactType = null;
    @Tag(tag=3) public VehicleMember member = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
