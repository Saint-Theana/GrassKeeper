package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGIntentionChangeType.*;
import org.sorapointa.proto.GCGIntentionChangeType;
import org.sorapointa.proto.GCGMsgPVEIntention.*;
import org.sorapointa.proto.GCGMsgPVEIntention;

public class GCGMsgPVEIntentionChange {
    @Tag(tag=6) public Integer changeType = null;
    @Tag(tag=2) public List<GCGMsgPVEIntention> changeIntentionList = new ArrayList<>();
}
