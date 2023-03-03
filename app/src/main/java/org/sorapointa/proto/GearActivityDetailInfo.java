package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GearLevelData.*;
import org.sorapointa.proto.GearLevelData;
import org.sorapointa.proto.JigsawPictureData.*;
import org.sorapointa.proto.JigsawPictureData;

public class GearActivityDetailInfo {
    @Tag(tag=14) public List<GearLevelData> gearLevelDataList = new ArrayList<>();
    @Tag(tag=8) public JigsawPictureData jigsawPictureData = null;
}
