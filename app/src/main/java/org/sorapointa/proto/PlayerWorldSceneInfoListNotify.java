package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerWorldSceneInfo.*;
import org.sorapointa.proto.PlayerWorldSceneInfo;

public class PlayerWorldSceneInfoListNotify {
    @Tag(tag=5) public List<PlayerWorldSceneInfo> infoList = new ArrayList<>();
}
