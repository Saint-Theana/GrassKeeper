package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaWishReq {
    public enum GachaWishReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1520) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer gachaType = null;
    @Tag(tag=10) public Integer gachaScheduleId = null;
    @Tag(tag=9) public Integer itemId = null;
}
