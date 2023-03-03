package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlueprintSlotInfo.*;
import org.sorapointa.proto.HomeBlueprintSlotInfo;

public class HomeCreateBlueprintRsp {
    @Tag(tag=1) public HomeBlueprintSlotInfo slotInfo = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
