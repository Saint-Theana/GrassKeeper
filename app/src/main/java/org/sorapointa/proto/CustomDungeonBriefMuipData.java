package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonAbstractMuipData.*;
import org.sorapointa.proto.CustomDungeonAbstractMuipData;
import org.sorapointa.proto.CustomDungeonSettingMuipData.*;
import org.sorapointa.proto.CustomDungeonSettingMuipData;
import org.sorapointa.proto.CustomDungeonSocialMuipData.*;
import org.sorapointa.proto.CustomDungeonSocialMuipData;

public class CustomDungeonBriefMuipData {
    @Tag(tag=1) public Long dungeonGuid = null;
    @Tag(tag=2) public Integer dungeonId = null;
    @Tag(tag=3) public String creatorNickname = null;
    @Tag(tag=4) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=5) public CustomDungeonSettingMuipData setting = null;
    @Tag(tag=6) public CustomDungeonAbstractMuipData abstract_ = null;
    @Tag(tag=7) public CustomDungeonSocialMuipData social = null;
}
