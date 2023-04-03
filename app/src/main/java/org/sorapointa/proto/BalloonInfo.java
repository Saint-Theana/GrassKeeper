package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BalloonPlayerInfo.*;
import org.sorapointa.proto.BalloonPlayerInfo;

public class BalloonInfo {
    public static class MapScenePlayerBalloonInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public BalloonPlayerInfo value = null;
    }

    @Tag(tag=13) public List<MapScenePlayerBalloonInfoMap> scenePlayerBalloonInfoMap = new ArrayList<>();
    @Tag(tag=7) public Integer endTime = null;
}
