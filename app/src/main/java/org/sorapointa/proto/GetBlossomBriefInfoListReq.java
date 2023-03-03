package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetBlossomBriefInfoListReq {
    @Tag(tag=4) public List<Integer> cityIdList = new ArrayList<>();
}
