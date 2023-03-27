package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NoDamageSkillResult {
    @Tag(tag=3) public Integer resultSeq = null;
    @Tag(tag=1) public Integer effectElement = null;
    @Tag(tag=13) public Integer fromResultSeq = null;
    @Tag(tag=9) public List<GCGDamageDetail> detailList = new ArrayList<>();
    @Tag(tag=5) public Integer srcCardGuid = null;
    @Tag(tag=15) public Integer skillId = null;
    @Tag(tag=4) public Integer targetCardGuid = null;
}
