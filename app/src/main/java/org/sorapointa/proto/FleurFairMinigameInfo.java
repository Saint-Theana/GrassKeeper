package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairBalloonInfo.*;
import org.sorapointa.proto.FleurFairBalloonInfo;
import org.sorapointa.proto.FleurFairFallInfo.*;
import org.sorapointa.proto.FleurFairFallInfo;
import org.sorapointa.proto.FleurFairMusicGameInfo.*;
import org.sorapointa.proto.FleurFairMusicGameInfo;

public class FleurFairMinigameInfo {
    @Tag(tag=13) public Integer minigameId = null;
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=15) public Integer openTime = null;
    @Tag(tag=12) public FleurFairBalloonInfo balloonInfo = null;
    @Tag(tag=11) public FleurFairFallInfo fallInfo = null;
    @Tag(tag=9) public FleurFairMusicGameInfo musicInfo = null;
}
