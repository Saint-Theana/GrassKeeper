package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TransmitReason.*;
import org.sorapointa.proto.TransmitReason;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ClientTransmitReq {
    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=14) public Integer reason = null;
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=9) public Vector rot = null;
}
