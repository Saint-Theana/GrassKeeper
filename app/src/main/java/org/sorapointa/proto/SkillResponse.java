package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SkillResponse {
    @Tag(tag=8) public List<Integer> skillIdList = new ArrayList<>();
    @Tag(tag=12) public Integer skillDepotId = null;
}
