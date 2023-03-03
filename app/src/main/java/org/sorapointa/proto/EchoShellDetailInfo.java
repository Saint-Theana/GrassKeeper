package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeDungeonInfo.*;
import org.sorapointa.proto.SummerTimeDungeonInfo;

public class EchoShellDetailInfo {
    @Tag(tag=8) public List<SummerTimeDungeonInfo> summerTimeDungeonList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> shellList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> passDungeonList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> takenRewardList = new ArrayList<>();
}
