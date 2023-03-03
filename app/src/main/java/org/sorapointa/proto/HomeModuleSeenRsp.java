package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeModuleSeenRsp {
    @Tag(tag=13) public List<Integer> seenModuleIdList = new ArrayList<>();
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
