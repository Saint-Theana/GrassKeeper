package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BalloonPlayerInfo.*;
import org.sorapointa.proto.BalloonPlayerInfo;

public class SceneGalleryBalloonInfo {
    public static class MapScenePlayerBalloonInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public BalloonPlayerInfo value = null;
    }

    @Tag(tag=14) public List<MapScenePlayerBalloonInfoMap> scenePlayerBalloonInfoMap = new ArrayList<>();
    @Tag(tag=5) public Integer endTime = null;
}
