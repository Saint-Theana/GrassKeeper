package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameRecord {
    @Tag(tag=9) public Boolean isUnlock = null;
    @Tag(tag=11) public Integer maxScore = null;
    @Tag(tag=6) public Integer maxCombo = null;
}
