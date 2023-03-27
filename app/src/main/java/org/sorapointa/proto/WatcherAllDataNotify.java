package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherAllDataNotify {
    public enum WatcherAllDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2205) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<Integer> watcherList = new ArrayList<>();
}
