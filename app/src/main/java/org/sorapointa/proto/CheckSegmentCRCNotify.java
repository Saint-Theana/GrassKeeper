package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SegmentInfo.*;
import org.sorapointa.proto.SegmentInfo;

public class CheckSegmentCRCNotify {
    public enum CheckSegmentCRCNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=46) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<SegmentInfo> infoList = new ArrayList<>();
}
