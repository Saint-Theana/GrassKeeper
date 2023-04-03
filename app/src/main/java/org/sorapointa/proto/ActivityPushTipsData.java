package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityPushTipsState.*;
import org.sorapointa.proto.ActivityPushTipsState;

public class ActivityPushTipsData {
    @Tag(tag=12) public Integer state = null;
    @Tag(tag=11) public Integer activityPushTipsId = null;
}
