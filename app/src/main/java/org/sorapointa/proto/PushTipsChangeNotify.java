package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PushTipsData.*;
import org.sorapointa.proto.PushTipsData;

public class PushTipsChangeNotify {
    public enum PushTipsChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2288) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<PushTipsData> pushTipsList = new ArrayList<>();
}
