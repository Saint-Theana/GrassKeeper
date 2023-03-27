package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgSkillResult {
    @Tag(tag=15) public Integer resultSeq = null;
    @Tag(tag=2) public Integer srcCardGuid = null;
    @Tag(tag=3) public Integer ahkoidfnbgc = null;
    @Tag(tag=7) public Integer targetCardGuid = null;
    @Tag(tag=1) public Integer effectElement = null;
    @Tag(tag=13) public Integer lastHp = null;
    @Tag(tag=6) public Integer npllnhifdoo = null;
    @Tag(tag=12) public List<GCGDamageDetail> detailList = new ArrayList<>();
    @Tag(tag=11) public Integer damage = null;
    @Tag(tag=4) public Integer skillId = null;
    @Tag(tag=14) public Integer fromResultSeq = null;
}
