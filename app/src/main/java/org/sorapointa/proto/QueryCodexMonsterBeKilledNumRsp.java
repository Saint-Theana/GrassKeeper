package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QueryCodexMonsterBeKilledNumRsp {
    @Tag(tag=4) public List<Integer> codexIdList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> beCapturedNumList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> beKilledNumList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
