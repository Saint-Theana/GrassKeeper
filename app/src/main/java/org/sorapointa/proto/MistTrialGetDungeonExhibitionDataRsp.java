package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialGetDungeonExhibitionDataRsp {
    public enum MistTrialGetDungeonExhibitionDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8208) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer trialId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
