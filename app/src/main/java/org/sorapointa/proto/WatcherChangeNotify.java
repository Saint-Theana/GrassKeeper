package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherChangeNotify {
    public enum WatcherChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2255) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<Integer> newWatcherList = new ArrayList<>();
    @Tag(tag=3) public List<Integer> removedWatcherList = new ArrayList<>();
}
