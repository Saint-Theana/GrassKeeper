package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightActivityRestartReq {
    @Tag(tag=4) public Integer groupId = null;
    @Tag(tag=10) public Integer scheduleId = null;
}
