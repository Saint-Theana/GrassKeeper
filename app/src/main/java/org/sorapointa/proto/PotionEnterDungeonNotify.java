package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionDungeonAvatar.*;
import org.sorapointa.proto.PotionDungeonAvatar;

public class PotionEnterDungeonNotify {
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=7) public Integer difficultyLevel = null;
    @Tag(tag=6) public List<PotionDungeonAvatar> dungeonAvatarList = new ArrayList<>();
    @Tag(tag=8) public Integer levelId = null;
    @Tag(tag=5) public Integer modeId = null;
}
