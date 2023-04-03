package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionDungeonAvatar.*;
import org.sorapointa.proto.PotionDungeonAvatar;

public class PotionEnterDungeonNotify {
    public enum PotionEnterDungeonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8043) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer difficultyLevel = null;
    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=1) public List<PotionDungeonAvatar> dungeonAvatarList = new ArrayList<>();
    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=6) public Integer modeId = null;
}
