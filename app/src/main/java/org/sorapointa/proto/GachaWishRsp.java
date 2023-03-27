package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaWishRsp {
    public enum GachaWishRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1574) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer wishProgress = null;
    @Tag(tag=7) public Integer wishMaxProgress = null;
    @Tag(tag=6) public Integer gachaType = null;
    @Tag(tag=11) public Integer gachaScheduleId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer wishItemId = null;
}
