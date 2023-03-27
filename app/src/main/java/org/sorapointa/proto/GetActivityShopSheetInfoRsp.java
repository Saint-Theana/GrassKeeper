package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetActivityShopSheetInfoRsp {
    public enum GetActivityShopSheetInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=770) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer shopType = null;
    @Tag(tag=10) public List<ActivityShopSheetInfo> sheetInfoList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
