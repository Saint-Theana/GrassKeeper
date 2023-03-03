package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSetBlueprintSlotOptionReq {
    @Tag(tag=1) public Integer slotId = null;
    @Tag(tag=8) public Boolean isAllowCopy = null;
}
