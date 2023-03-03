package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearActivityStartPlayGearRsp {
    @Tag(tag=9) public Integer levelId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
