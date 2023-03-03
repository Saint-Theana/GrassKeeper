package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameSettleReq {
    @Tag(tag=384) public List<Integer> buttonList = new ArrayList<>();
    @Tag(tag=795) public Integer delay = null;
    @Tag(tag=4) public List<Integer> noteList = new ArrayList<>();
    @Tag(tag=15) public Integer scoreRating = null;
    @Tag(tag=9) public Integer score = null;
    @Tag(tag=6) public Long ugcGuid = null;
    @Tag(tag=13) public Integer restartTimes = null;
    @Tag(tag=422) public Boolean isCustomDelay = null;
    @Tag(tag=5) public Integer maxCombo = null;
    @Tag(tag=1058) public Integer isFullCombo = null;
    @Tag(tag=409,isFloat=true) public Float speed = null;
    @Tag(tag=3) public Boolean isSaveScore = null;
    @Tag(tag=1) public Integer combo = null;
    @Tag(tag=7) public Integer musicBasicId = null;
    @Tag(tag=2) public Integer starRating = null;
    @Tag(tag=1953) public Integer volume = null;
    @Tag(tag=14) public Integer correctHit = null;
    @Tag(tag=1285) public Boolean isCustomSpeed = null;
}
