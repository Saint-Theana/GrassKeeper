package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.NpcPositionInfo.*;
import org.sorapointa.proto.NpcPositionInfo;

public class GetSceneNpcPositionRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<NpcPositionInfo> npcInfoList = new ArrayList<>();
    @Tag(tag=4) public Integer sceneId = null;
}
