package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2EnterDungeonRsp {
    public enum NCGEDBHPGLH {
        @Tag(tag=0) None ,
        @Tag(tag=23456) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer challengeModeSkillNo = null;
    @Tag(tag=7) public Integer levelId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer challengeModeDifficulty = null;
}
