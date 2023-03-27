package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriStartBossChallengeReq {
    public enum MichiaeMatsuriStartBossChallengeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8680) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer gadgetEntityId = null;
    @Tag(tag=6) public Integer difficulty = null;
}
