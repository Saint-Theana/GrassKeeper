package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementInfo.*;
import org.sorapointa.proto.HomeSceneArrangementInfo;

public class HomeGetArrangementInfoRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<HomeSceneArrangementInfo> sceneArrangementInfoList = new ArrayList<>();
}
