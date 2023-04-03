package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeVerifyBlockData.*;
import org.sorapointa.proto.HomeVerifyBlockData;

public class HomeVerifySceneData {
    @Tag(tag=11) public Integer sceneId = null;
    @Tag(tag=15) public Integer isRoom = null;
    @Tag(tag=5) public List<HomeVerifyBlockData> blocks = new ArrayList<>();
    @Tag(tag=13) public Integer moduleId = null;
    @Tag(tag=9) public Integer version = null;
}
