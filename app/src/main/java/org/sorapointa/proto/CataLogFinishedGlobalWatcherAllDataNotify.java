package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CataLogFinishedGlobalWatcherAllDataNotify {
    public enum KGDHMHMGKCN {
        @Tag(tag=0) None ,
        @Tag(tag=6352) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<CataLogGlobalWatcherFinishedData> finishedGlobalWatcherDataList = new ArrayList<>();
}
