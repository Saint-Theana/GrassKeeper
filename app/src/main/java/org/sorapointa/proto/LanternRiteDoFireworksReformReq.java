package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternRiteDoFireworksReformReq {
    public enum LanternRiteDoFireworksReformReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8813) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer challengeId = null;
    @Tag(tag=10) public Integer stageId = null;
    @Tag(tag=15) public Integer factorId = null;
    @Tag(tag=9) public Integer skillId = null;
}
