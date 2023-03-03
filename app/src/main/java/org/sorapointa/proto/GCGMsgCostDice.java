package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;

public class GCGMsgCostDice {
    @Tag(tag=6) public Integer controllerId = null;
    @Tag(tag=13) public List<Integer> selectDiceIndexList = new ArrayList<>();
    @Tag(tag=9) public Integer reason = null;
}
