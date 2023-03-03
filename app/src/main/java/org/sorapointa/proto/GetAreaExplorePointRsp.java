package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAreaExplorePointRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<Integer> areaIdList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> explorePointList = new ArrayList<>();
}
