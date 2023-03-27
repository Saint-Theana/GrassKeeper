package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderLevelProgressNotify {
    public enum BartenderLevelProgressNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8317) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer levelId = null;
    @Tag(tag=3) public Integer score = null;
    @Tag(tag=10) public Boolean isNewRecord = null;
    @Tag(tag=5) public Boolean isFinish = null;
}
