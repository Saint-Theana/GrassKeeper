package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PbNavMeshStatsInfo.*;
import org.sorapointa.proto.PbNavMeshStatsInfo;

public class NavMeshStatsNotify {
    @Tag(tag=4) public List<PbNavMeshStatsInfo> infos = new ArrayList<>();
}
