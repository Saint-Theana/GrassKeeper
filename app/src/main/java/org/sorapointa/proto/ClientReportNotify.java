package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientReportNotify {
    public enum ClientReportNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=13) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public String reportValue = null;
    @Tag(tag=12) public String reportType = null;
}
