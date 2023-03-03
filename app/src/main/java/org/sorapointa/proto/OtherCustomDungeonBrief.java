package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonAbstract.*;
import org.sorapointa.proto.CustomDungeonAbstract;
import org.sorapointa.proto.CustomDungeonSetting.*;
import org.sorapointa.proto.CustomDungeonSetting;
import org.sorapointa.proto.CustomDungeonSocial.*;
import org.sorapointa.proto.CustomDungeonSocial;
import org.sorapointa.proto.SocialDetail.*;
import org.sorapointa.proto.SocialDetail;

public class OtherCustomDungeonBrief {
    @Tag(tag=4) public SocialDetail creatorDetail = null;
    @Tag(tag=15) public Integer battleMinCostTime = null;
    @Tag(tag=2) public CustomDungeonAbstract abstract_ = null;
    @Tag(tag=14) public Long dungeonGuid = null;
    @Tag(tag=10) public CustomDungeonSetting setting = null;
    @Tag(tag=6) public Integer dungeonId = null;
    @Tag(tag=1) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=11) public Boolean isAdventureDungeon = null;
    @Tag(tag=9) public Boolean isPsnPlatform = null;
    @Tag(tag=3) public Boolean isStored = null;
    @Tag(tag=12) public CustomDungeonSocial social = null;
}
