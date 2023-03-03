package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExecuteGroupTriggerReq {
    @Tag(tag=15) public String sourceName = null;
    @Tag(tag=12) public Integer targetEntityId = null;
    @Tag(tag=8,isSigned=true) public Integer param2 = null;
    @Tag(tag=4) public Integer sourceEntityId = null;
    @Tag(tag=10,isSigned=true) public Integer param3 = null;
    @Tag(tag=9,isSigned=true) public Integer param1 = null;
}
