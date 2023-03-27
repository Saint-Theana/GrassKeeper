package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GalleryStartSource {
        @Tag(tag=0) GalleryStartByNone ,
        @Tag(tag=1) GalleryStartByMatch ,
        @Tag(tag=2) GalleryStartByDraft ;
}
