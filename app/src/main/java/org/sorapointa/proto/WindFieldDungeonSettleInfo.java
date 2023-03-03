package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WindFieldDungeonFailReason.*;
import org.sorapointa.proto.WindFieldDungeonFailReason;

public class WindFieldDungeonSettleInfo {
    @Tag(tag=11) public List<Integer> afterWatcherIdList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> beforeWatcherIdList = new ArrayList<>();
    @Tag(tag=2) public Integer failReason = null;
}
