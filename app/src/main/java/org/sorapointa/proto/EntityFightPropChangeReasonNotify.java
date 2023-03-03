package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChangeEnergyReason.*;
import org.sorapointa.proto.ChangeEnergyReason;
import org.sorapointa.proto.ChangeHpReason.*;
import org.sorapointa.proto.ChangeHpReason;
import org.sorapointa.proto.PropChangeReason.*;
import org.sorapointa.proto.PropChangeReason;

public class EntityFightPropChangeReasonNotify {
    @Tag(tag=10) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=1,isFloat=true) public Float propDelta = null;
    @Tag(tag=14) public Integer changeHpReason = null;
    @Tag(tag=6) public Integer reason = null;
    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=15) public Integer changeEnergyReason = null;
    @Tag(tag=13) public Integer propType = null;
}
