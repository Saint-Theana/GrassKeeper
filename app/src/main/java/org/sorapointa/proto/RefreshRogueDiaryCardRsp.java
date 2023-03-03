package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshRogueDiaryCardRsp {
    @Tag(tag=15) public List<Integer> randCardList = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
