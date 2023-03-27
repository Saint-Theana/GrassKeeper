package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerSettleNotify {
    public enum EHJNACJCAIL {
        @Tag(tag=0) None ,
        @Tag(tag=21188) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer galleryId = null;
    @Tag(tag=13) public Integer combo = null;
    @Tag(tag=3) public Integer time = null;
    @Tag(tag=8) public List<Uint32Pair> updateSkillList = new ArrayList<>();
    @Tag(tag=1) public Integer score = null;
    @Tag(tag=4) public Boolean isDungeon = null;
    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=10) public Integer reason = null;
    @Tag(tag=14) public Boolean isSingleMode = null;
    @Tag(tag=7) public Boolean isNewRecord = null;
}
