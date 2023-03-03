package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetInvestigationMonsterReq {
    @Tag(tag=3) public List<Integer> cityIdList = new ArrayList<>();
    @Tag(tag=4) public Boolean isForMark = null;
}
