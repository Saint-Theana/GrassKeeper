package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ScenePlayBattleInfo.*;
import org.sorapointa.proto.ScenePlayBattleInfo;

public class ScenePlayBattleInfoListNotify {
    @Tag(tag=12) public List<ScenePlayBattleInfo> battleInfoList = new ArrayList<>();
}
