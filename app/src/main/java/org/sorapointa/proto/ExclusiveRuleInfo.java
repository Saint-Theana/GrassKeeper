package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExclusiveRuleInfo {
    @Tag(tag=11) public List<Integer> objectIdList = new ArrayList<>();
    @Tag(tag=6) public Integer ruleType = null;
}
