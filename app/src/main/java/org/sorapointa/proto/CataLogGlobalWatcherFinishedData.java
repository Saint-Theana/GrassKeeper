package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CataLogGlobalWatcherFinishedData {
    @Tag(tag=5) public Integer catalogType = null;
    @Tag(tag=2) public List<Integer> finishedGlobalWatcherList = new ArrayList<>();
}
