package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SeaLampV3RaceInfo.*;
import org.sorapointa.proto.SeaLampV3RaceInfo;
import org.sorapointa.proto.SeaLampV3CampInfo.*;
import org.sorapointa.proto.SeaLampV3CampInfo;
import org.sorapointa.proto.SeaLampV3ShadowInfo.*;
import org.sorapointa.proto.SeaLampV3ShadowInfo;

public class SeaLampV3Info {
    @Tag(tag=4) public SeaLampV3RaceInfo raceInfo = null;
    @Tag(tag=11) public SeaLampV3CampInfo campInfo = null;
    @Tag(tag=3) public SeaLampV3ShadowInfo shadowInfo = null;
}
