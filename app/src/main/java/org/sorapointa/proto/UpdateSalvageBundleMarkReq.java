package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdateSalvageBundleMarkReq {
    public enum UpdateSalvageBundleMarkReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8786) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer stageId = null;
    @Tag(tag=4) public Integer challengeType = null;
}
