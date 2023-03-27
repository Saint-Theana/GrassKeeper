package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MonsterAIConfigHashNotify {
    public enum MonsterAIConfigHashNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3324) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9,isSigned=true) public Integer hashValue = null;
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=1) public Integer jobId = null;
}
