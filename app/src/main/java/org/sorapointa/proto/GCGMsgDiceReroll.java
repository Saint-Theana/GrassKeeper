package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDiceSideType.*;
import org.sorapointa.proto.GCGDiceSideType;

public class GCGMsgDiceReroll {
    @Tag(tag=2) public Integer controllerId = null;
    @Tag(tag=1) public List<Integer> selectDiceIndexList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> diceSideList = new ArrayList<>();
}
