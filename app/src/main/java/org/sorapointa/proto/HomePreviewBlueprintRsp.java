package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementInfo.*;
import org.sorapointa.proto.HomeSceneArrangementInfo;

public class HomePreviewBlueprintRsp {
    @Tag(tag=12) public HomeSceneArrangementInfo sceneArrangementInfo = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public String shareCode = null;
}
