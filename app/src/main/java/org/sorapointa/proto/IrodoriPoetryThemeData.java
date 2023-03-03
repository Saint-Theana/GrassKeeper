package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriPoetryThemeData {
    @Tag(tag=1) public List<Integer> scannedIndexList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> lineIdList = new ArrayList<>();
    @Tag(tag=2) public Integer maxProgress = null;
    @Tag(tag=13) public Integer themeId = null;
    @Tag(tag=5) public Integer progress = null;
    @Tag(tag=12) public Integer minProgress = null;
    @Tag(tag=9) public Integer selectedLineId = null;
}
