package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExclusiveRuleInfo.*;
import org.sorapointa.proto.ExclusiveRuleInfo;

public class ExclusiveRuleNotify {
    @Tag(tag=5) public List<ExclusiveRuleInfo> ruleInfoList = new ArrayList<>();
}
