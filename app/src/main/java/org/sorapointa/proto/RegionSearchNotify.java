package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionSearchInfo.*;
import org.sorapointa.proto.RegionSearchInfo;

public class RegionSearchNotify {
    @Tag(tag=1) public List<RegionSearchInfo> regionSearchList = new ArrayList<>();
    @Tag(tag=8) public Integer uid = null;
}
