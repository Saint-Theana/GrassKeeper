package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.JigsawPictureData.*;
import org.sorapointa.proto.JigsawPictureData;
import org.sorapointa.proto.GearLevelData.*;
import org.sorapointa.proto.GearLevelData;

public class GearInfo {
    @Tag(tag=9) public List<GearLevelData> gearLevelDataList = new ArrayList<>();
    @Tag(tag=13) public JigsawPictureData jigsawPictureData = null;
}
