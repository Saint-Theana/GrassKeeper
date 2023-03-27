package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriPoetryThemeData {
    @Tag(tag=6) public List<Integer> scannedIndexList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> lineIdList = new ArrayList<>();
    @Tag(tag=14) public Integer progress = null;
    @Tag(tag=13) public Integer maxProgress = null;
    @Tag(tag=7) public Integer selectedLineId = null;
    @Tag(tag=1) public Integer themeId = null;
    @Tag(tag=15) public Integer minProgress = null;
}
