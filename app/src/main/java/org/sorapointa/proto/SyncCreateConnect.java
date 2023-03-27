package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SyncCreateConnect {
    @Tag(tag=6) public List<BreakoutSyncConnectUidInfo> uidInfoList = new ArrayList<>();
}
