package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterIrodoriChessDungeonReq {
    @Tag(tag=1) public Boolean isHardMap = null;
    @Tag(tag=11) public Integer levelId = null;
}
