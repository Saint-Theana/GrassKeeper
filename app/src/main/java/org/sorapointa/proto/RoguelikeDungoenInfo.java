package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueStageInfo.*;
import org.sorapointa.proto.RogueStageInfo;
import org.sorapointa.proto.RoguelikeShikigamiRecord.*;
import org.sorapointa.proto.RoguelikeShikigamiRecord;

public class RoguelikeDungoenInfo {
    @Tag(tag=6) public List<RogueStageInfo> stageList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> equippedRuneList = new ArrayList<>();
    @Tag(tag=1) public List<RoguelikeShikigamiRecord> shikigamiList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> runeList = new ArrayList<>();
    @Tag(tag=10) public Boolean isContentClosed = null;
    @Tag(tag=8) public Integer contentCloseTime = null;
}
