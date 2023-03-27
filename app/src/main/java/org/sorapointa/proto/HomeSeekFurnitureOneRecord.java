package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSeekFurnitureOneRecord {
    @Tag(tag=6) public List<HomeSeekFurniturePlayerScore> engagedPlayerScoreList = new ArrayList<>();
    @Tag(tag=3) public Integer timestamp = null;
}
