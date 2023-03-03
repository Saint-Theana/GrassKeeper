package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryPreStartNotify {
    @Tag(tag=10) public Integer galleryId = null;
    @Tag(tag=9) public Integer preStartEndTime = null;
}
