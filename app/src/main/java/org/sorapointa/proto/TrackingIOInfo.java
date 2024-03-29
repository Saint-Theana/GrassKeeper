package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TrackingIOInfo {
    @Tag(tag=2) public String rydevicetype = null;
    @Tag(tag=6) public String clientTz = null;
    @Tag(tag=15) public String currentCaid = null;
    @Tag(tag=11) public String cachedCaid = null;
    @Tag(tag=5) public String deviceid = null;
    @Tag(tag=9) public String mac = null;
    @Tag(tag=3) public String appid = null;
}
