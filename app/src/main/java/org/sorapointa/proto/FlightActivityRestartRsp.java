package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightActivityRestartRsp {
    @Tag(tag=11) public Integer groupId = null;
    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
