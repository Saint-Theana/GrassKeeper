package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BalloonInfo.*;
import org.sorapointa.proto.BalloonInfo;
import org.sorapointa.proto.FallInfo.*;
import org.sorapointa.proto.FallInfo;
import org.sorapointa.proto.MusicInfo.*;
import org.sorapointa.proto.MusicInfo;

public class FleurFairMinigameInfo {
    @Tag(tag=14) public Integer minigameId = null;
    @Tag(tag=3) public Boolean isOpen = null;
    @Tag(tag=6) public Integer openTime = null;
    @Tag(tag=13) public BalloonInfo balloonInfo = null;
    @Tag(tag=11) public FallInfo fallInfo = null;
    @Tag(tag=9) public MusicInfo musicInfo = null;
}
