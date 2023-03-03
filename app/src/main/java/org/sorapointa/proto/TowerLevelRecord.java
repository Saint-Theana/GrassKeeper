package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerLevelRecord {
    @Tag(tag=13) public List<Integer> satisfiedCondList = new ArrayList<>();
    @Tag(tag=10) public Integer levelId = null;
}
