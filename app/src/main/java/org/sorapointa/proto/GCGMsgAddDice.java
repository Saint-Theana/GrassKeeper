package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;
import org.sorapointa.proto.GCGDiceSideType.*;
import org.sorapointa.proto.GCGDiceSideType;

public class GCGMsgAddDice {
    public static class MapDiceMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapBeforeDiceMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public List<MapDiceMap> diceMap = new ArrayList<>();
    @Tag(tag=5) public List<MapBeforeDiceMap> beforeDiceMap = new ArrayList<>();
    @Tag(tag=3) public Integer controllerId = null;
    @Tag(tag=9) public Integer reason = null;
    @Tag(tag=10,isSigned=true) public Integer changeCount = null;
}
