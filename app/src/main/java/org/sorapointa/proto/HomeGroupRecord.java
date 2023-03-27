package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeGroupRecord {
    @Tag(tag=8) public Integer groupId = null;
    @Tag(tag=1457) public RacingGalleryInfo racingGalleryInfo = null;
    @Tag(tag=1480) public BalloonGalleryInfo balloonGalleryInfo = null;
    @Tag(tag=1758) public StakePlayInfo stakePlayInfo = null;
    @Tag(tag=1801) public SeekFurnitureGalleryInfo seekFurnitureGalleryInfo = null;
}
