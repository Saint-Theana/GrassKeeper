package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NightCrowGadgetObservationMatchReq {
    public enum NightCrowGadgetObservationMatchReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=843) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer gadgetEntityId = null;
    @Tag(tag=9) public Integer targetGadgetState = null;
}
