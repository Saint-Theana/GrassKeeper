package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeVerifyBlockData.*;
import org.sorapointa.proto.HomeVerifyBlockData;

public class HomeVerifySceneData {
    @Tag(tag=6) public List<HomeVerifyBlockData> blocks = new ArrayList<>();
    @Tag(tag=11) public Integer moduleId = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=14) public Integer version = null;
    @Tag(tag=2) public Integer isRoom = null;
}
