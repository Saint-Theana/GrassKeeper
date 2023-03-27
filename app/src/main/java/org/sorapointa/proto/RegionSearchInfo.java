package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RegionSearchInfo {
    @Tag(tag=7) public Integer id = null;
    @Tag(tag=4) public List<RegionSearch> regionSearchList = new ArrayList<>();
    @Tag(tag=14) public Boolean isEntered = null;
}
