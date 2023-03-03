package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeDeleteBlueprintRsp {
    @Tag(tag=5) public Integer slotId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
