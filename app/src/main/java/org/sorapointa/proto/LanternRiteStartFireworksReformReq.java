package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternRiteStartFireworksReformReq {
    public enum LanternRiteStartFireworksReformReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8874) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer challengeId = null;
    @Tag(tag=11) public Integer stageId = null;
}
