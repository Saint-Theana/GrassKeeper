package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampV3Info {
    @Tag(tag=4) public SeaLampV3RaceInfo raceInfo = null;
    @Tag(tag=11) public SeaLampV3CampInfo campInfo = null;
    @Tag(tag=3) public SeaLampV3ShadowInfo shadowInfo = null;
}
