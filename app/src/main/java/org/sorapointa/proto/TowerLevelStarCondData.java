package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerLevelStarCondData {
    @Tag(tag=5) public Integer condValue = null;
    @Tag(tag=1) public Boolean isFail = null;
    @Tag(tag=2) public Boolean isPause = null;
    @Tag(tag=8) public Integer starCondIndex = null;
}
