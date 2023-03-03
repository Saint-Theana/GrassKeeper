package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneInitFinishRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer enterSceneToken = null;
}
