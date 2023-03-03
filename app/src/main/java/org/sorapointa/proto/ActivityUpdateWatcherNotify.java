package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityWatcherInfo.*;
import org.sorapointa.proto.ActivityWatcherInfo;

public class ActivityUpdateWatcherNotify {
    @Tag(tag=2) public ActivityWatcherInfo watcherInfo = null;
    @Tag(tag=1) public Integer activityId = null;
}
