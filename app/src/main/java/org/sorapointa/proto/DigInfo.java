package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DigMarkPoint.*;
import org.sorapointa.proto.DigMarkPoint;

public class DigInfo {
    @Tag(tag=14) public List<Integer> stageIdList = new ArrayList<>();
    @Tag(tag=2) public List<DigMarkPoint> digMarkPointList = new ArrayList<>();
    @Tag(tag=10) public Integer stageId = null;
}
