package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetSceneAreaReq {
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=7) public Integer belongUid = null;
}
