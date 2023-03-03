package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusUnlockGearRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer mechanicusId = null;
    @Tag(tag=14) public Integer gearId = null;
}
