package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetCoolDownNotify {
    public enum WidgetCoolDownNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4290) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<WidgetCoolDownData> normalCoolDownDataList = new ArrayList<>();
    @Tag(tag=10) public List<WidgetCoolDownData> groupCoolDownDataList = new ArrayList<>();
}
