package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TransmitReason.*;
import org.sorapointa.proto.TransmitReason;

public class ClientTransmitRsp {
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
