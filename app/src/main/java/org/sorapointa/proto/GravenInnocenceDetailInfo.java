package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GravenInnocenceCampInfo.*;
import org.sorapointa.proto.GravenInnocenceCampInfo;
import org.sorapointa.proto.GravenInnocenceCarveInfo.*;
import org.sorapointa.proto.GravenInnocenceCarveInfo;
import org.sorapointa.proto.GravenInnocencePhotoInfo.*;
import org.sorapointa.proto.GravenInnocencePhotoInfo;
import org.sorapointa.proto.GravenInnocenceRaceInfo.*;
import org.sorapointa.proto.GravenInnocenceRaceInfo;

public class GravenInnocenceDetailInfo {
    @Tag(tag=8) public Boolean isContentClosed = null;
    @Tag(tag=10) public GravenInnocenceRaceInfo raceInfo = null;
    @Tag(tag=7) public GravenInnocencePhotoInfo photoInfo = null;
    @Tag(tag=13) public GravenInnocenceCarveInfo carveInfo = null;
    @Tag(tag=12) public GravenInnocenceCampInfo campInfo = null;
}
