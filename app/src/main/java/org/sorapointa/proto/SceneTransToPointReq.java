package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTransToPointReq {
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=1) public Integer pointId = null;
}
