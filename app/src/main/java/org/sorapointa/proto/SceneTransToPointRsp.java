package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTransToPointRsp {
    @Tag(tag=14) public Integer pointId = null;
    @Tag(tag=3) public Integer sceneId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
