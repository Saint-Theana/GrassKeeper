package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RegionSearchState {
        @Tag(tag=0) REGION_SEARCH_STATE_NONE ,
        @Tag(tag=1) REGION_SEARCH_STATE_UNSTARTED ,
        @Tag(tag=2) REGION_SEARCH_STATE_STARTED ,
        @Tag(tag=3) REGION_SEARCH_STATE_WAIT_REWARD ,
        @Tag(tag=4) REGION_SEARCH_STATE_FINISHED ;
}
