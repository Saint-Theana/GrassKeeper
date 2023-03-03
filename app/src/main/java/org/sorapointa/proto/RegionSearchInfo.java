package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionSearch.*;
import org.sorapointa.proto.RegionSearch;

public class RegionSearchInfo {
    @Tag(tag=5) public Integer id = null;
    @Tag(tag=1) public List<RegionSearch> regionSearchList = new ArrayList<>();
    @Tag(tag=7) public Boolean isEntered = null;
}
