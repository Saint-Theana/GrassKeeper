package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CataLogGlobalWatcherFinishedData.*;
import org.sorapointa.proto.CataLogGlobalWatcherFinishedData;

public class CataLogNewFinishedGlobalWatcherNotify {
    @Tag(tag=2) public List<CataLogGlobalWatcherFinishedData> newFinishedGlobalWatcherDataList = new ArrayList<>();
}
