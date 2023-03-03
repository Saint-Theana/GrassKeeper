package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapHostInfoNotify {
    @Tag(tag=8) public List<Integer> mpChallengeRegionList = new ArrayList<>();
}
