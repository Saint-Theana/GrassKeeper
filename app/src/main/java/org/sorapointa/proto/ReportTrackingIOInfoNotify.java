package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReportTrackingIOInfoNotify {
    public enum ReportTrackingIOInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4131) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public String appid = null;
    @Tag(tag=8) public String rydevicetype = null;
    @Tag(tag=3) public String mac = null;
    @Tag(tag=2) public String clientTz = null;
    @Tag(tag=9) public String deviceid = null;
}
