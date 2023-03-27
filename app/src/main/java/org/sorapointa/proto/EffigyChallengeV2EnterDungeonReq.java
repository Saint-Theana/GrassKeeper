package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2EnterDungeonReq {
    public enum OHPCHJBJCCG {
        @Tag(tag=0) None ,
        @Tag(tag=23798) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=12) public Integer challengeModeSkillNo = null;
    @Tag(tag=8) public Integer challengeModeDifficulty = null;
}
