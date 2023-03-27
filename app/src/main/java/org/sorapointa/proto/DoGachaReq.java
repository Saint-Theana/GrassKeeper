package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DoGachaReq {
    public enum DoGachaReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1587) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer gachaRandom = null;
    @Tag(tag=2) public Integer gachaType = null;
    @Tag(tag=3) public Integer gachaScheduleId = null;
    @Tag(tag=15) public String gachaTag = null;
    @Tag(tag=10) public Integer gachaTimes = null;
}
