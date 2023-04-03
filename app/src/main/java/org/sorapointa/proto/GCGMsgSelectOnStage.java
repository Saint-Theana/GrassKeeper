package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;

public class GCGMsgSelectOnStage {
    @Tag(tag=13) public Integer reason = null;
    @Tag(tag=5) public Integer cardGuid = null;
    @Tag(tag=2) public Integer controllerId = null;
}
