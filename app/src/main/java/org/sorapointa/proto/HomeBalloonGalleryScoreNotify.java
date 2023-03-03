package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBalloonGalleryScoreNotify {
    @Tag(tag=10) public Integer triggerEntityId = null;
    @Tag(tag=9) public Integer curScore = null;
    @Tag(tag=7) public Integer addScore = null;
    @Tag(tag=5) public Integer galleryId = null;
}
