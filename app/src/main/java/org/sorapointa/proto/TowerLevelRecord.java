package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerLevelRecord {
    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=7) public List<Integer> satisfiedCondList = new ArrayList<>();
}
