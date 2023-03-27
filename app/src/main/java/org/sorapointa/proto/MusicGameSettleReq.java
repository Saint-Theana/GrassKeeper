package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameSettleReq {
    public enum MusicGameSettleReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8066) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Long ugcGuid = null;
    @Tag(tag=1626) public List<Integer> buttonList = new ArrayList<>();
    @Tag(tag=11) public Boolean isSaveScore = null;
    @Tag(tag=7) public Integer musicBasicId = null;
    @Tag(tag=2) public Integer score = null;
    @Tag(tag=493) public Integer isFullCombo = null;
    @Tag(tag=5) public List<Integer> noteList = new ArrayList<>();
    @Tag(tag=484,isFloat=true) public Float speed = null;
    @Tag(tag=15) public Integer combo = null;
    @Tag(tag=527) public Boolean isCustomSpeed = null;
    @Tag(tag=12) public Integer maxCombo = null;
    @Tag(tag=252) public Integer delay = null;
    @Tag(tag=13) public Integer correctHit = null;
    @Tag(tag=108) public Integer volume = null;
    @Tag(tag=9) public Integer restartTimes = null;
    @Tag(tag=497) public Boolean isCustomDelay = null;
    @Tag(tag=3) public Integer starRating = null;
    @Tag(tag=8) public Integer scoreRating = null;
}
