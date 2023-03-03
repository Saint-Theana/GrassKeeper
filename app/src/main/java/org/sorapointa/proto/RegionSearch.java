package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionSearchState.*;
import org.sorapointa.proto.RegionSearchState;

public class RegionSearch {
    @Tag(tag=13) public Boolean isEntered = null;
    @Tag(tag=5) public Integer progress = null;
    @Tag(tag=2) public Integer state = null;
    @Tag(tag=8) public Integer regionSearchId = null;
}
