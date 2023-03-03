package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DigMarkPoint.*;
import org.sorapointa.proto.DigMarkPoint;

public class DigActivityDetailInfo {
    @Tag(tag=15) public List<Integer> stageIdList = new ArrayList<>();
    @Tag(tag=11) public List<DigMarkPoint> digMarkPointList = new ArrayList<>();
    @Tag(tag=8) public Integer stageId = null;
}
