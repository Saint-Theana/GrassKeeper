package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueEffectRecord.*;
import org.sorapointa.proto.RogueEffectRecord;

public class RoguelikeEffectDataNotify {
    @Tag(tag=7) public List<RogueEffectRecord> curseList = new ArrayList<>();
    @Tag(tag=4) public List<RogueEffectRecord> cardList = new ArrayList<>();
}
