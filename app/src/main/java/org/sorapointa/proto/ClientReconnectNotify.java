package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientReconnectReason.*;
import org.sorapointa.proto.ClientReconnectReason;

public class ClientReconnectNotify {
    @Tag(tag=6) public Integer reason = null;
}
