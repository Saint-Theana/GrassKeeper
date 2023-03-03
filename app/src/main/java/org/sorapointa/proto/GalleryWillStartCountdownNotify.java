package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStartSource.*;
import org.sorapointa.proto.GalleryStartSource;

public class GalleryWillStartCountdownNotify {
    @Tag(tag=11) public Integer startSource = null;
    @Tag(tag=12) public Integer endTime = null;
    @Tag(tag=7) public Boolean isEnd = null;
    @Tag(tag=14) public Integer galleryId = null;
}
