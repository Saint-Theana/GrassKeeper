package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusUnlockGearReq {
    @Tag(tag=7) public Integer mechanicusId = null;
    @Tag(tag=6) public Integer gearId = null;
}
