package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FallPlayerInfo.*;
import org.sorapointa.proto.FallPlayerInfo;

public class SceneGalleryFallInfo {
    public static class MapScenePlayerFallInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FallPlayerInfo value = null;
    }

    @Tag(tag=12) public List<MapScenePlayerFallInfoMap> scenePlayerFallInfoMap = new ArrayList<>();
    @Tag(tag=2) public Integer endTime = null;
}
