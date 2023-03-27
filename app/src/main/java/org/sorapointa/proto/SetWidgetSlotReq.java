package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetWidgetSlotReq {
    public enum SetWidgetSlotReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4299) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=3) public Integer op = null;
    @Tag(tag=4) public Integer materialId = null;
}
