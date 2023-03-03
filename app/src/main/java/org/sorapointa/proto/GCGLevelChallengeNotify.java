package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGBossChallengeData.*;
import org.sorapointa.proto.GCGBossChallengeData;
import org.sorapointa.proto.GCGLevelData.*;
import org.sorapointa.proto.GCGLevelData;

public class GCGLevelChallengeNotify {
    @Tag(tag=3) public List<GCGBossChallengeData> unlockBossChallengeList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> unlockWorldChallengeList = new ArrayList<>();
    @Tag(tag=10) public List<GCGLevelData> levelList = new ArrayList<>();
}
