package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExecuteGadgetLuaReq {
    @Tag(tag=12) public Integer sourceEntityId = null;
    @Tag(tag=1,isSigned=true) public Integer param3 = null;
    @Tag(tag=5,isSigned=true) public Integer param1 = null;
    @Tag(tag=14,isSigned=true) public Integer param2 = null;
}
