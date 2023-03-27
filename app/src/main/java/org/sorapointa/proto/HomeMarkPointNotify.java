package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeMarkPointNotify {
    public enum HomeMarkPointNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4832) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<HomeMarkPointSceneData> markPointDataList = new ArrayList<>();
}
