package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ServerLogLevel.*;
import org.sorapointa.proto.ServerLogLevel;
import org.sorapointa.proto.ServerLogType.*;
import org.sorapointa.proto.ServerLogType;

public class ServerLogNotify {
    public enum ServerLogNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=24) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public String serverLog = null;
    @Tag(tag=15) public Integer logLevel = null;
    @Tag(tag=9) public Integer logType = null;
}
