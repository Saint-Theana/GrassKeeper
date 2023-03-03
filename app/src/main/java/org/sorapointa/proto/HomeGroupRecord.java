package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBalloonRecord.*;
import org.sorapointa.proto.HomeBalloonRecord;
import org.sorapointa.proto.HomeRacingRecord.*;
import org.sorapointa.proto.HomeRacingRecord;
import org.sorapointa.proto.HomeSeekFurnitureAllRecord.*;
import org.sorapointa.proto.HomeSeekFurnitureAllRecord;
import org.sorapointa.proto.HomeStakeRecord.*;
import org.sorapointa.proto.HomeStakeRecord;

public class HomeGroupRecord {
    @Tag(tag=5) public Integer groupId = null;
    @Tag(tag=467) public HomeRacingRecord racingGalleryInfo = null;
    @Tag(tag=1410) public HomeBalloonRecord balloonGalleryInfo = null;
    @Tag(tag=347) public HomeStakeRecord stakePlayInfo = null;
    @Tag(tag=1822) public HomeSeekFurnitureAllRecord seekFurnitureGalleryInfo = null;
}
