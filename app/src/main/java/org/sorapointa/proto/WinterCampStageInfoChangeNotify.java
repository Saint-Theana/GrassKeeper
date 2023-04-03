package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampStageInfo.*;
import org.sorapointa.proto.WinterCampStageInfo;

public class WinterCampStageInfoChangeNotify {
    public enum WinterCampStageInfoChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8517) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public WinterCampStageInfo battleInfo = null;
    @Tag(tag=3) public WinterCampStageInfo exploreInfo = null;
}
