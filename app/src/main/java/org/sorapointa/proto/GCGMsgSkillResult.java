package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDamageDetail.*;
import org.sorapointa.proto.GCGDamageDetail;

public class GCGMsgSkillResult {
    @Tag(tag=12) public Integer skillId = null;
    @Tag(tag=14) public Integer lastHp = null;
    @Tag(tag=2) public List<GCGDamageDetail> detailList = new ArrayList<>();
    @Tag(tag=7) public Integer targetCardGuid = null;
    @Tag(tag=5) public Integer effectElement = null;
    @Tag(tag=15) public Integer fromResultSeq = null;
    @Tag(tag=6) public Integer damage = null;
    @Tag(tag=4) public Integer resultSeq = null;
    @Tag(tag=8) public Integer srcCardGuid = null;
}
