package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherChangeNotify {
    @Tag(tag=2) public List<Integer> removedWatcherList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> newWatcherList = new ArrayList<>();
}
