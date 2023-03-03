package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DoRoguelikeDungeonCardGachaRsp {
    @Tag(tag=8) public Boolean isCanRefresh = null;
    @Tag(tag=15) public List<Integer> cardList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
