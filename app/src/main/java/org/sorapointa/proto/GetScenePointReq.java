package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetScenePointReq {
    @Tag(tag=10) public Integer belongUid = null;
    @Tag(tag=4) public Integer sceneId = null;
}
