package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryVintageHuntingSettleNotify {
    public enum MPFAKBDJLDA {
        @Tag(tag=0) None ,
        @Tag(tag=21852) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean hasNewWatcher = null;
    @Tag(tag=2) public Integer stageId = null;
    @Tag(tag=9) public Integer totalWatcherNum = null;
    @Tag(tag=6) public Boolean isNewRecord = null;
    @Tag(tag=5) public Integer finishedWatcherNum = null;
    @Tag(tag=15) public FirstStageInfo firstStageInfo = null;
    @Tag(tag=8) public SecondStageInfo secondStageInfo = null;
    @Tag(tag=4) public ThirdStageInfo thirdStageInfo = null;
}
