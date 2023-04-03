package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MistTrialBestAvatar.*;
import org.sorapointa.proto.MistTrialBestAvatar;

public class MistTrialLevelData {
    @Tag(tag=2) public Integer openTime = null;
    @Tag(tag=4) public Integer firstPassTime = null;
    @Tag(tag=12) public Integer levelId = null;
    @Tag(tag=6) public Boolean isOpen = null;
    @Tag(tag=14) public MistTrialBestAvatar bestHitAvatar = null;
    @Tag(tag=13) public List<MistTrialBestAvatar> bestAvatarList = new ArrayList<>();
}
