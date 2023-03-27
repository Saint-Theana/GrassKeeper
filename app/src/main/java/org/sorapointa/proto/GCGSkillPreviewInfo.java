package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSkillPreviewInfo {
    public static class MapCardTokenChangeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGSkillPreviewTokenChangeInfo value = null;
    }

    public static class MapHpInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGSkillPreviewHpInfo value = null;
    }

    public static class MapReactionInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGSkillPreviewElementReactionInfo value = null;
    }

    @Tag(tag=12) public List<MapCardTokenChangeMap> cardTokenChangeMap = new ArrayList<>();
    @Tag(tag=14) public List<GCGSkillPreviewOnstageChangeInfo> changeOnstageCharacterList = new ArrayList<>();
    @Tag(tag=6) public GCGSkillPreviewExtraInfo extraInfo = null;
    @Tag(tag=1) public List<MapHpInfoMap> hpInfoMap = new ArrayList<>();
    @Tag(tag=9) public List<MapReactionInfoMap> reactionInfoMap = new ArrayList<>();
    @Tag(tag=11) public List<GCGSkillPreviewCardInfo> addCardList = new ArrayList<>();
    @Tag(tag=2) public Integer skillId = null;
    @Tag(tag=15) public List<GCGSkillPreviewCardInfo> rmCardList = new ArrayList<>();
}
