package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatSettleNotify {
    public enum SummerTimeSprintBoatSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8474) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer leftTime = null;
    @Tag(tag=14) public Integer score = null;
    @Tag(tag=1) public Integer groupId = null;
    @Tag(tag=3) public Integer collectNum = null;
    @Tag(tag=8) public Integer medalLevel = null;
    @Tag(tag=2) public Boolean isSuccess = null;
    @Tag(tag=7) public Integer totalNum = null;
    @Tag(tag=4) public Boolean isNewRecord = null;
}
