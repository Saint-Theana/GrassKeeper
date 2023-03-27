package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameRecord {
    @Tag(tag=8) public Boolean isUnlock = null;
    @Tag(tag=15) public Integer maxScore = null;
    @Tag(tag=1) public Integer maxCombo = null;
}
