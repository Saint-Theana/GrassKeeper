package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDiceSideType.*;
import org.sorapointa.proto.GCGDiceSideType;

public class GCGMsgDiceRoll {
    @Tag(tag=10) public List<Integer> diceSideList = new ArrayList<>();
    @Tag(tag=15) public Integer diceNum = null;
    @Tag(tag=5) public Integer controllerId = null;
}
