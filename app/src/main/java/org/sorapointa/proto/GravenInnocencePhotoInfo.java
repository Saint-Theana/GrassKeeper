package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GravenInnocencePhotoObjectInfo.*;
import org.sorapointa.proto.GravenInnocencePhotoObjectInfo;
import org.sorapointa.proto.GravenInnocencePhotoStageInfo.*;
import org.sorapointa.proto.GravenInnocencePhotoStageInfo;

public class GravenInnocencePhotoInfo {
    @Tag(tag=5) public List<GravenInnocencePhotoStageInfo> stageInfoList = new ArrayList<>();
    @Tag(tag=7) public List<GravenInnocencePhotoObjectInfo> objectInfoList = new ArrayList<>();
}
