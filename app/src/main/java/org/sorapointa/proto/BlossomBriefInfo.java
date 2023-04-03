package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class BlossomBriefInfo {
    @Tag(tag=6) public Boolean isGuideOpened = null;
    @Tag(tag=3) public Integer resin = null;
    @Tag(tag=9) public Vector pos = null;
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=10) public Integer state = null;
    @Tag(tag=8) public Integer cityId = null;
    @Tag(tag=11) public Integer rewardId = null;
    @Tag(tag=2) public Integer circleCampId = null;
    @Tag(tag=15) public Integer monsterLevel = null;
    @Tag(tag=5) public Integer refreshId = null;
}
