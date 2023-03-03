package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayTeamEntityInfo.*;
import org.sorapointa.proto.PlayTeamEntityInfo;

public class SyncScenePlayTeamEntityNotify {
    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=3) public List<PlayTeamEntityInfo> entityInfoList = new ArrayList<>();
}
