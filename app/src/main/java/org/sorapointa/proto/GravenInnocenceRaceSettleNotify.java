package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class GravenInnocenceRaceSettleNotify {
    @Tag(tag=4) public Boolean isNewRecord = null;
    @Tag(tag=6) public Integer galleryId = null;
    @Tag(tag=5) public Integer score = null;
    @Tag(tag=2) public Integer reason = null;
    @Tag(tag=13) public Integer totalCointCount = null;
    @Tag(tag=10) public Integer remainTime = null;
    @Tag(tag=1) public Integer challengeProgress = null;
    @Tag(tag=8) public Integer coinCount = null;
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=11) public Integer levelId = null;
}
