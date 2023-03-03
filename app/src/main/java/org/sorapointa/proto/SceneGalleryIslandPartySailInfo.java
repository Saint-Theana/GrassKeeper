package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStartSource.*;
import org.sorapointa.proto.GalleryStartSource;
import org.sorapointa.proto.IslandPartySailStage.*;
import org.sorapointa.proto.IslandPartySailStage;

public class SceneGalleryIslandPartySailInfo {
    @Tag(tag=14) public Integer maxCleanProgress = null;
    @Tag(tag=10) public Integer cleanProgress = null;
    @Tag(tag=1) public Integer startSource = null;
    @Tag(tag=11) public Integer killProgress = null;
    @Tag(tag=15) public Integer coin = null;
    @Tag(tag=12) public Integer stage = null;
    @Tag(tag=8) public Integer maxKillProgress = null;
}
