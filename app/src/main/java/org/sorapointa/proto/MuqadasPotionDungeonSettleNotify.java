package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MuqadasPotionDungeonSettleNotify {
    public enum CCBLHNEEDDL {
        @Tag(tag=0) None ,
        @Tag(tag=23665) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=7) public Integer captureWeaknessCount = null;
    @Tag(tag=14) public Integer finalScore = null;
    @Tag(tag=3) public Boolean isSuccess = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
}
