package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MapAreaChangeNotify {
    public enum MapAreaChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3049) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<MapAreaInfo> mapAreaInfoList = new ArrayList<>();
}
