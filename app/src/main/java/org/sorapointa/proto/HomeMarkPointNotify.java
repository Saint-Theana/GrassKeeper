package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeMarkPointSceneData.*;
import org.sorapointa.proto.HomeMarkPointSceneData;

public class HomeMarkPointNotify {
    @Tag(tag=12) public List<HomeMarkPointSceneData> markPointDataList = new ArrayList<>();
}
