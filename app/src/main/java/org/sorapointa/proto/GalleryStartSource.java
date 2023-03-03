package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GalleryStartSource {
        @Tag(tag=0) GALLERY_START_SOURCE_BY_NONE ,
        @Tag(tag=1) GALLERY_START_SOURCE_BY_MATCH ,
        @Tag(tag=2) GALLERY_START_SOURCE_BY_DRAFT ;
}
