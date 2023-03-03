package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ServerLogLevel.*;
import org.sorapointa.proto.ServerLogLevel;
import org.sorapointa.proto.ServerLogType.*;
import org.sorapointa.proto.ServerLogType;

public class ServerLogNotify {
    @Tag(tag=7) public String serverLog = null;
    @Tag(tag=9) public Integer logType = null;
    @Tag(tag=15) public Integer logLevel = null;
}
