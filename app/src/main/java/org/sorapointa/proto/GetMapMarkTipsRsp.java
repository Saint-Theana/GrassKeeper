package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkTipsInfo.*;
import org.sorapointa.proto.MapMarkTipsInfo;

public class GetMapMarkTipsRsp {
    public enum GetMapMarkTipsRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3089) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<MapMarkTipsInfo> markTipsList = new ArrayList<>();
}
