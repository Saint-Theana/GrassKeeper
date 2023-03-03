package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSetBlueprintSlotOptionRsp {
    @Tag(tag=13) public Integer slotId = null;
    @Tag(tag=7) public Boolean isAllowCopy = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
