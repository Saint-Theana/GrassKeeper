package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshRoguelikeDungeonCardRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<Integer> resCardList = new ArrayList<>();
}