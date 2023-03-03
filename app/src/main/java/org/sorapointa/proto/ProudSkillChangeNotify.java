package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillChangeNotify {
    @Tag(tag=11) public Long avatarGuid = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=8) public Integer skillDepotId = null;
    @Tag(tag=12) public List<Integer> proudSkillList = new ArrayList<>();
}
