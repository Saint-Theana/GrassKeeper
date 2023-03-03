package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityInfo.*;
import org.sorapointa.proto.ActivityInfo;

public class ActivityInfoNotify {
    @Tag(tag=9) public ActivityInfo activityInfo = null;
}
