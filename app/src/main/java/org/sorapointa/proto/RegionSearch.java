package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionSearchState.*;
import org.sorapointa.proto.RegionSearchState;

public class RegionSearch {
    @Tag(tag=1) public Integer regionSearchId = null;
    @Tag(tag=15) public Integer state = null;
    @Tag(tag=6) public Boolean isEntered = null;
    @Tag(tag=8) public Integer progress = null;
}
