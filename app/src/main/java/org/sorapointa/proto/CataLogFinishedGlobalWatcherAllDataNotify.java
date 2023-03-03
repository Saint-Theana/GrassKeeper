package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CataLogGlobalWatcherFinishedData.*;
import org.sorapointa.proto.CataLogGlobalWatcherFinishedData;

public class CataLogFinishedGlobalWatcherAllDataNotify {
    @Tag(tag=13) public List<CataLogGlobalWatcherFinishedData> finishedGlobalWatcherDataList = new ArrayList<>();
}
