package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampV3RaceInfo {
    @Tag(tag=6) public List<SeaLampV3RaceLevelInfo> levelInfoList = new ArrayList<>();
}
