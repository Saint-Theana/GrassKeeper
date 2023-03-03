package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchReason.*;
import org.sorapointa.proto.MatchReason;

public class PlayerMatchStopNotify {
    @Tag(tag=1) public Integer reason = null;
    @Tag(tag=12) public Integer hostUid = null;
}
