package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterIrodoriChessDungeonRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Boolean isHardMap = null;
    @Tag(tag=13) public Integer levelId = null;
}
