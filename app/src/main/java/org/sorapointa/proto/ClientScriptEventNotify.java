package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientScriptEventNotify {
    @Tag(tag=9,isSigned=true) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=14) public Integer sourceEntityId = null;
    @Tag(tag=10) public Integer eventType = null;
    @Tag(tag=13) public Integer targetEntityId = null;
}
