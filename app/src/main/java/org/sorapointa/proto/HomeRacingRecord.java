package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeRacingGalleryRecord.*;
import org.sorapointa.proto.HomeRacingGalleryRecord;

public class HomeRacingRecord {
    @Tag(tag=2) public List<HomeRacingGalleryRecord> recordList = new ArrayList<>();
}
