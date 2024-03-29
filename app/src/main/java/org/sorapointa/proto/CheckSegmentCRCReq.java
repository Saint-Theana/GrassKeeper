package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SegmentCRCInfo.*;
import org.sorapointa.proto.SegmentCRCInfo;

public class CheckSegmentCRCReq {
    public enum CheckSegmentCRCReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=100) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<SegmentCRCInfo> infoList = new ArrayList<>();
}
