package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBalloonRecord {
    @Tag(tag=7) public List<HomeBalloonGalleryRecord> recordList = new ArrayList<>();
}
