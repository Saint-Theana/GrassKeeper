package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityShopSheetInfo.*;
import org.sorapointa.proto.ActivityShopSheetInfo;

public class GetActivityShopSheetInfoRsp {
    @Tag(tag=6) public List<ActivityShopSheetInfo> sheetInfoList = new ArrayList<>();
    @Tag(tag=8) public Integer shopType = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
