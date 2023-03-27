package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocencePhotoInfo {
    @Tag(tag=10) public List<GravenInnocencePhotoObjectInfo> objectInfoList = new ArrayList<>();
    @Tag(tag=3) public List<GravenInnocencePhotoStageInfo> stageInfoList = new ArrayList<>();
}
