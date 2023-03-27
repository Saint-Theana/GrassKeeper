package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityFightPropChangeReasonNotify {
    public enum EntityFightPropChangeReasonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1280) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isFloat=true) public Float propDelta = null;
    @Tag(tag=13) public Integer reason = null;
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=1) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=6) public Integer changeHpReason = null;
    @Tag(tag=3) public Integer changeEnergyReson = null;
    @Tag(tag=14) public Integer propType = null;
}
