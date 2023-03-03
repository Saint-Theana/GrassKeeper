package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ClientReconnectReason {
        @Tag(tag=0) CLIENT_RECONNECT_REASON_NONE ,
        @Tag(tag=1) CLIENT_RECONNECT_REASON_QUIT_MP ;
}
