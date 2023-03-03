package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;

public class GCGMsgTokenChange {
    @Tag(tag=13) public Integer before = null;
    @Tag(tag=4) public Integer tokenType = null;
    @Tag(tag=2) public Integer cardGuid = null;
    @Tag(tag=11) public Integer after = null;
    @Tag(tag=7) public Integer reason = null;
}
