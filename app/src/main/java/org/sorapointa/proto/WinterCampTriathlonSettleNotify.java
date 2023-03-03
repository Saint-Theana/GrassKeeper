package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampTriathlonSettleNotify {
    @Tag(tag=9) public Integer limitedCoin = null;
    @Tag(tag=2) public Integer normalCoin = null;
    @Tag(tag=7) public Boolean isNewRecord = null;
    @Tag(tag=3) public Boolean isSuccess = null;
    @Tag(tag=13) public Integer galleryId = null;
    @Tag(tag=4) public Integer remainTime = null;
    @Tag(tag=11) public Integer score = null;
    @Tag(tag=15) public Integer raceId = null;
}
