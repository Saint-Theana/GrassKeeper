package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocenceInfo {
    @Tag(tag=12) public GravenInnocenceCarveInfo carveInfo = null;
    @Tag(tag=5) public GravenInnocencePhotoInfo photoInfo = null;
    @Tag(tag=13) public GravenInnocenceRaceInfo raceInfo = null;
    @Tag(tag=8) public Boolean isContentClosed = null;
    @Tag(tag=11) public GravenInnocenceCampInfo campInfo = null;
}
