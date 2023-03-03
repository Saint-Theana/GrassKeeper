package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EffigyChallengeV2LevelData.*;
import org.sorapointa.proto.EffigyChallengeV2LevelData;

public class EffigyChallengeV2DetailInfo {
    @Tag(tag=3) public List<EffigyChallengeV2LevelData> levelDataList = new ArrayList<>();
}
