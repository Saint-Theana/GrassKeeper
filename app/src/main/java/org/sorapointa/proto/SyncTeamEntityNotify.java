package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TeamEntityInfo.*;
import org.sorapointa.proto.TeamEntityInfo;

public class SyncTeamEntityNotify {
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=15) public List<TeamEntityInfo> teamEntityInfoList = new ArrayList<>();
}
