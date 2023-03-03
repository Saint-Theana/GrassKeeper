package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;
import org.sorapointa.proto.HomeSeekFurnitureOneRecord.*;
import org.sorapointa.proto.HomeSeekFurnitureOneRecord;

public class HomeSeekFurnitureGalleryScoreNotify {
    @Tag(tag=15) public Integer galleryId = null;
    @Tag(tag=5) public HomeSeekFurnitureOneRecord record = null;
    @Tag(tag=4) public Integer reason = null;
}
