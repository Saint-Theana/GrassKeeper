package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGGrowthLevelTakeRewardReq {
    public enum BBHGHAMIGPI {
        @Tag(tag=0) None ,
        @Tag(tag=7040) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer level = null;
}
