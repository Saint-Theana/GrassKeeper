package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.EvtBeingHitInfo.*;
import org.sorapointa.proto.EvtBeingHitInfo;

public class EvtBeingHitsCombineNotify {
    public enum EvtBeingHitsCombineNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=335) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer forwardType = null;
    @Tag(tag=4) public List<EvtBeingHitInfo> evtBeingHitInfoList = new ArrayList<>();
}
