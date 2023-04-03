package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GravenInnocencePhotoObjectInfo.*;
import org.sorapointa.proto.GravenInnocencePhotoObjectInfo;
import org.sorapointa.proto.GravenInnocencePhotoStageInfo.*;
import org.sorapointa.proto.GravenInnocencePhotoStageInfo;

public class GravenInnocencePhotoInfo {
    @Tag(tag=10) public List<GravenInnocencePhotoObjectInfo> objectInfoList = new ArrayList<>();
    @Tag(tag=3) public List<GravenInnocencePhotoStageInfo> stageInfoList = new ArrayList<>();
}
