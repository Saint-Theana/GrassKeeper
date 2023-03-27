package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterTrainingGallerySettleNotify {
    public enum PCMLJAAPJMF {
        @Tag(tag=0) None ,
        @Tag(tag=23677) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer finalScore = null;
    @Tag(tag=14) public Integer gadgetLifePercentage = null;
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=11) public Integer settleRound = null;
    @Tag(tag=12) public Integer deadFungusNum = null;
    @Tag(tag=9) public Integer totalUsedTime = null;
    @Tag(tag=7) public Boolean isFinalSettle = null;
    @Tag(tag=5) public Boolean isNewRecord = null;
}
