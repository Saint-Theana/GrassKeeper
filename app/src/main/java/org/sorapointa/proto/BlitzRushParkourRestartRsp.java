package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlitzRushParkourRestartRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=1) public Integer scheduleId = null;
}
