package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CataLogGlobalWatcherFinishedData {
    @Tag(tag=8) public List<Integer> finishedGlobalWatcherList = new ArrayList<>();
    @Tag(tag=13) public Integer catalogType = null;
}
