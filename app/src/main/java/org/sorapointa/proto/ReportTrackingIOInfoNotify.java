package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReportTrackingIOInfoNotify {
    @Tag(tag=12) public String rydevicetype = null;
    @Tag(tag=1) public String deviceid = null;
    @Tag(tag=13) public String clientTz = null;
    @Tag(tag=14) public String appid = null;
    @Tag(tag=15) public String mac = null;
}
