package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGWeekChallengeInfo.*;
import org.sorapointa.proto.GCGWeekChallengeInfo;

public class GCGWeekChallengeInfoNotify {
    public enum BPPOMFBCIKL {
        @Tag(tag=0) None ,
        @Tag(tag=7890) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isNotifyNpcChange = null;
    @Tag(tag=9) public Integer nextRefreshTime = null;
    @Tag(tag=8) public List<GCGWeekChallengeInfo> challengeInfoList = new ArrayList<>();
}
