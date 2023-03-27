package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialSelectAvatarAndEnterDungeonRsp {
    public enum MistTrialSelectAvatarAndEnterDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8551) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer trialId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
