package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AdjustTrackingInfo {
    @Tag(tag=9) public String eventToken = null;
    @Tag(tag=4) public String adid = null;
    @Tag(tag=2) public String idfa = null;
    @Tag(tag=14) public String appToken = null;
    @Tag(tag=3) public String gpsAdid = null;
    @Tag(tag=13) public String fireAdid = null;
}
