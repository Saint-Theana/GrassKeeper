package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CutSceneExtraParam.*;
import org.sorapointa.proto.CutSceneExtraParam;

public class CutSceneBeginNotify {
    @Tag(tag=9) public Boolean isWaitOthers = null;
    @Tag(tag=14) public Integer cutsceneId = null;
    @Tag(tag=3) public List<CutSceneExtraParam> extraParamList = new ArrayList<>();
}
