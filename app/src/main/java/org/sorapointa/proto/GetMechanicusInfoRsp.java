package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MechanicusInfo.*;
import org.sorapointa.proto.MechanicusInfo;

public class GetMechanicusInfoRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public MechanicusInfo mechanicusInfo = null;
}
