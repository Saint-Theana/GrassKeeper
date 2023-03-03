package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryFlowerStartParam.*;
import org.sorapointa.proto.GalleryFlowerStartParam;

public class GalleryStartNotify {
    @Tag(tag=6) public Integer endTime = null;
    @Tag(tag=11) public Integer playerCount = null;
    @Tag(tag=9) public Integer ownerUid = null;
    @Tag(tag=13) public Integer galleryId = null;
    @Tag(tag=5) public Integer startTime = null;
    @Tag(tag=15) public GalleryFlowerStartParam flowerStartParam = null;
}
