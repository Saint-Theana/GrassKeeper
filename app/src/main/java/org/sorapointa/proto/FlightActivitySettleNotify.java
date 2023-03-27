package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightActivitySettleNotify {
    public enum FlightActivitySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2169) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer medalLevel = null;
    @Tag(tag=13) public Boolean isSuccess = null;
    @Tag(tag=2) public Integer collectNum = null;
    @Tag(tag=15) public Boolean isNewRecord = null;
    @Tag(tag=3) public Integer totalNum = null;
    @Tag(tag=10) public Integer groupId = null;
    @Tag(tag=12) public Integer score = null;
    @Tag(tag=5) public Integer leftTime = null;
}
