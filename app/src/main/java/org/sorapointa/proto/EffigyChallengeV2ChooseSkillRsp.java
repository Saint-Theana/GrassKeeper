package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2ChooseSkillRsp {
    public enum NPHDEAPKFJD {
        @Tag(tag=0) None ,
        @Tag(tag=21025) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=13) public Integer challengeModeSkillNo = null;
}
