package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSTakeCardProficiencyRewardReq {
    public enum AJDEPLPALCB {
        @Tag(tag=0) None ,
        @Tag(tag=7289) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer rewardIndex = null;
    @Tag(tag=14) public Integer cardId = null;
}
