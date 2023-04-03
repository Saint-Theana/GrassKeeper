package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProtoLog_ClientLogHead {
    public static class ClientLogHead {
        @Tag(tag=1) public String eventTime = null;
        @Tag(tag=2) public String logSerialNumber = null;
        @Tag(tag=3) public Integer actionId = null;
        @Tag(tag=4) public String actionName = null;
        @Tag(tag=5) public String uploadIp = null;
        @Tag(tag=6) public String productId = null;
        @Tag(tag=7) public String channelId = null;
        @Tag(tag=8) public String regionName = null;
        @Tag(tag=9) public String gameVersion = null;
        @Tag(tag=10) public String deviceType = null;
        @Tag(tag=11) public String deviceUuid = null;
        @Tag(tag=12) public String macAddr = null;
        @Tag(tag=13) public String accountName = null;
        @Tag(tag=14) public String accountUuid = null;
    }

}
