package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeModuleSeenReq {
    @Tag(tag=5) public List<Integer> seenModuleIdList = new ArrayList<>();
}
