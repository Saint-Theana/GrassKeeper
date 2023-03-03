package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBalloonGalleryRecord.*;
import org.sorapointa.proto.HomeBalloonGalleryRecord;

public class HomeBalloonRecord {
    @Tag(tag=15) public List<HomeBalloonGalleryRecord> recordList = new ArrayList<>();
}
