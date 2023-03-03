package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RoguelikeRuneRecord.*;
import org.sorapointa.proto.RoguelikeRuneRecord;

public class RoguelikeRuneRecordUpdateNotify {
    @Tag(tag=11) public List<RoguelikeRuneRecord> runeRecordList = new ArrayList<>();
}
