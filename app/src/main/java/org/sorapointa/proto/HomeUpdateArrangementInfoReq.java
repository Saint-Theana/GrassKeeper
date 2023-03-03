package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementInfo.*;
import org.sorapointa.proto.HomeSceneArrangementInfo;

public class HomeUpdateArrangementInfoReq {
    @Tag(tag=6) public HomeSceneArrangementInfo sceneArrangementInfo = null;
}
