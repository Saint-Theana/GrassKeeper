package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementInfo.*;
import org.sorapointa.proto.HomeSceneArrangementInfo;

public class HomeCreateBlueprintReq {
    @Tag(tag=2) public HomeSceneArrangementInfo sceneArrangementInfo = null;
    @Tag(tag=13) public Integer slotId = null;
    @Tag(tag=6) public String serverShareCode = null;
    @Tag(tag=4) public Integer genShareCodeCount = null;
}
