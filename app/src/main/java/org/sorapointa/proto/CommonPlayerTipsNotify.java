package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CommonPlayerTipsNotify {
    public enum CommonPlayerTipsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8996) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer notifyType = null;
    @Tag(tag=14) public List<String> textMapIdList = new ArrayList<>();
}
