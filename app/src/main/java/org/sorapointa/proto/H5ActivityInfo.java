package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class H5ActivityInfo {
    @Tag(tag=3) public Integer h5ActivityId = null;
    @Tag(tag=4) public String url = null;
    @Tag(tag=7) public Boolean isEntranceOpen = null;
    @Tag(tag=8) public Integer h5ScheduleId = null;
    @Tag(tag=10) public Integer endTime = null;
    @Tag(tag=11) public String prefabPath = null;
    @Tag(tag=2) public Integer contentCloseTime = null;
    @Tag(tag=13) public Integer beginTime = null;
}
