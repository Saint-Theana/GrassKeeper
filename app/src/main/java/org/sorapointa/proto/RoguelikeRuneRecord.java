package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeRuneRecord {
    @Tag(tag=14) public Integer leftCount = null;
    @Tag(tag=6) public Integer runeId = null;
    @Tag(tag=4) public Integer maxCount = null;
}
