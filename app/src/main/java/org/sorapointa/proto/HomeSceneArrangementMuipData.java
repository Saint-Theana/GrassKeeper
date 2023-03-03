package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlockArrangementMuipData.*;
import org.sorapointa.proto.HomeBlockArrangementMuipData;

public class HomeSceneArrangementMuipData {
    @Tag(tag=1) public Integer moduleId = null;
    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=3) public Boolean isRoom = null;
    @Tag(tag=4) public List<HomeBlockArrangementMuipData> blockDataList = new ArrayList<>();
}
