package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GravenInnocenceRaceLevelInfo.*;
import org.sorapointa.proto.GravenInnocenceRaceLevelInfo;

public class GravenInnocenceRaceInfo {
    @Tag(tag=11) public List<GravenInnocenceRaceLevelInfo> levelInfoList = new ArrayList<>();
}
