package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DuelHeartLevelDifficultyInfo {
    @Tag(tag=7) public Integer difficulty = null;
    @Tag(tag=1) public Boolean isOpen = null;
    @Tag(tag=6) public Integer costTime = null;
}
