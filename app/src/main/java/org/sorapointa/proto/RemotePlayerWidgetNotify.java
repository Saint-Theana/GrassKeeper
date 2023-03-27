package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RemotePlayerWidgetNotify {
    public enum EEINCMFJCDI {
        @Tag(tag=0) None ,
        @Tag(tag=5996) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<PlayerWidgetInfo> playerWidgetInfoList = new ArrayList<>();
}
