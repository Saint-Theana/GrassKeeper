package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;

public class GCGMsgSelectOnStage {
    @Tag(tag=6) public Integer controllerId = null;
    @Tag(tag=10) public Integer reason = null;
    @Tag(tag=4) public Integer cardGuid = null;
}
