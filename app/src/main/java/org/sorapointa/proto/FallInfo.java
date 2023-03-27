package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FallInfo {
    public static class MapScenePlayerFallInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FallPlayerInfo value = null;
    }

    @Tag(tag=6) public Integer endTime = null;
    @Tag(tag=9) public List<MapScenePlayerFallInfoMap> scenePlayerFallInfoMap = new ArrayList<>();
}
