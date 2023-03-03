package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGEndReason.*;
import org.sorapointa.proto.GCGEndReason;

public class GCGMsgGameOver {
    @Tag(tag=13) public Integer endReason = null;
    @Tag(tag=6) public Integer winControllerId = null;
}
