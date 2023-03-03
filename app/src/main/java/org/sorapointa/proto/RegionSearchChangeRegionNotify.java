package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RegionSearchChangeRegionNotify {
    public enum RegionEvent {
        @Tag(tag=0) REGION_EVENT_NONE ,
        @Tag(tag=1) REGION_EVENT_ENTER ,
        @Tag(tag=2) REGION_EVENT_LEAVE ;
    }

    @Tag(tag=1) public RegionEvent event = null;
    @Tag(tag=10) public Integer regionId = null;
}
