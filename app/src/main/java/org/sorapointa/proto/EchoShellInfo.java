package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeDungeonInfo.*;
import org.sorapointa.proto.SummerTimeDungeonInfo;

public class EchoShellInfo {
    @Tag(tag=10) public List<Integer> shellList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> passDungeonList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> takenRewardList = new ArrayList<>();
    @Tag(tag=13) public List<SummerTimeDungeonInfo> summerTimeDungeonList = new ArrayList<>();
}
