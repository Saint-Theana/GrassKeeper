package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSeekFurnitureOneRecord.*;
import org.sorapointa.proto.HomeSeekFurnitureOneRecord;

public class SeekFurnitureGalleryInfo {
    @Tag(tag=5) public List<HomeSeekFurnitureOneRecord> recordList = new ArrayList<>();
}
