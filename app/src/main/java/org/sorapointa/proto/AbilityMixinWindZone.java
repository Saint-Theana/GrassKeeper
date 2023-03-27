package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinWindZone {
    @Tag(tag=12) public List<Integer> zoneIdList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> entityIds = new ArrayList<>();
}
