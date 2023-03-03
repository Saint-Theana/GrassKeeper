package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatRestartRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer scheduleId = null;
    @Tag(tag=4) public Integer groupId = null;
}
