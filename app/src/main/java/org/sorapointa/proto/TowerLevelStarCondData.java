package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerLevelStarCondData {
    @Tag(tag=15) public Boolean isFail = null;
    @Tag(tag=9) public Integer condValue = null;
    @Tag(tag=13) public Boolean isPause = null;
    @Tag(tag=6) public Integer starCondIndex = null;
}
