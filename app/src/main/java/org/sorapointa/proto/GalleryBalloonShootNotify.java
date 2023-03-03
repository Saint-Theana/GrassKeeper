package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBalloonShootNotify {
    @Tag(tag=12) public Integer triggerEntityId = null;
    @Tag(tag=5) public Integer galleryId = null;
    @Tag(tag=14) public Integer combo = null;
    @Tag(tag=6) public Long comboDisableTime = null;
    @Tag(tag=11,isSigned=true) public Integer addScore = null;
    @Tag(tag=13) public Integer curScore = null;
}
