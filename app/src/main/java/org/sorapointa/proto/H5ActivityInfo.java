package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class H5ActivityInfo {
    @Tag(tag=13) public String prefabPath = null;
    @Tag(tag=1) public Integer contentCloseTime = null;
    @Tag(tag=6) public Boolean isEntranceOpen = null;
    @Tag(tag=11) public Integer endTime = null;
    @Tag(tag=4) public Integer h5ActivityId = null;
    @Tag(tag=8) public Integer beginTime = null;
    @Tag(tag=3) public String url = null;
    @Tag(tag=9) public Integer h5ScheduleId = null;
}
