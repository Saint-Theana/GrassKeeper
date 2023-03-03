package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkTipsInfo.*;
import org.sorapointa.proto.MapMarkTipsInfo;

public class GetMapMarkTipsRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<MapMarkTipsInfo> markTipsList = new ArrayList<>();
}
