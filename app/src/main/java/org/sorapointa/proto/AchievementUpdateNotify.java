package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Achievement.*;
import org.sorapointa.proto.Achievement;

public class AchievementUpdateNotify {
    @Tag(tag=14) public List<Achievement> achievementList = new ArrayList<>();
}
