package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProtoLog_ClientLogBodyLogin {
    public static class ClientLogBodyLogin {
        @Tag(tag=1) public String actionType = null;
        @Tag(tag=2) public String actionResult = null;
        @Tag(tag=3) public Integer actionTime = null;
        @Tag(tag=4) public String xg = null;
        @Tag(tag=5) public Integer signalLevel = null;
        @Tag(tag=6) public String dns = null;
    }

}
