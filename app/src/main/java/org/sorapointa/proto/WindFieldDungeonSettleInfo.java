package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldDungeonSettleInfo {
    @Tag(tag=6) public List<Integer> afterWatcherIdList = new ArrayList<>();
    @Tag(tag=12) public Integer failReason = null;
    @Tag(tag=3) public List<Integer> beforeWatcherIdList = new ArrayList<>();
}
