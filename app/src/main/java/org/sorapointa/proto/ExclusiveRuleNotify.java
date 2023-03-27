package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExclusiveRuleNotify {
    public enum ExclusiveRuleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=176) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<ExclusiveRuleInfo> ruleInfoList = new ArrayList<>();
}
