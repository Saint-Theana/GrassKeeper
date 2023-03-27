package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSTakeCardProficiencyRewardRsp {
    public enum JNIEFIACMPI {
        @Tag(tag=0) None ,
        @Tag(tag=7198) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer cardId = null;
    @Tag(tag=12) public Integer rewardIndex = null;
}
