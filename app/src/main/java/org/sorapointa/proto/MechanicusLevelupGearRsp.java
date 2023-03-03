package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusLevelupGearRsp {
    @Tag(tag=7) public Integer gearId = null;
    @Tag(tag=2) public Integer mechanicusId = null;
    @Tag(tag=12) public Integer afterGearLevel = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
