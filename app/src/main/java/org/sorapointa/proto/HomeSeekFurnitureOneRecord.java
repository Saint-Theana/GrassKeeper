package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSeekFurniturePlayerScore.*;
import org.sorapointa.proto.HomeSeekFurniturePlayerScore;

public class HomeSeekFurnitureOneRecord {
    @Tag(tag=8) public List<HomeSeekFurniturePlayerScore> engagedPlayerScoreList = new ArrayList<>();
    @Tag(tag=3) public Integer timestamp = null;
}
