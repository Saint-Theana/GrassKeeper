package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResinCardData.*;
import org.sorapointa.proto.ResinCardData;

public class ResinCardDataUpdateNotify {
    public enum ResinCardDataUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4125) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer todayStartTime = null;
    @Tag(tag=10) public List<ResinCardData> cardDataList = new ArrayList<>();
}
