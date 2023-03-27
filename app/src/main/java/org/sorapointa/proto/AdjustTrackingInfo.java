package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AdjustTrackingInfo {
    @Tag(tag=5) public String appToken = null;
    @Tag(tag=8) public String gpsAdid = null;
    @Tag(tag=15) public String fireAdid = null;
    @Tag(tag=3) public String adid = null;
    @Tag(tag=7) public String idfa = null;
    @Tag(tag=13) public String eventToken = null;
}
