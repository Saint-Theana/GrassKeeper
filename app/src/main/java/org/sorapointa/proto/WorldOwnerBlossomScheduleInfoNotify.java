package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomScheduleInfo.*;
import org.sorapointa.proto.BlossomScheduleInfo;

public class WorldOwnerBlossomScheduleInfoNotify {
    @Tag(tag=3) public BlossomScheduleInfo scheduleInfo = null;
}
