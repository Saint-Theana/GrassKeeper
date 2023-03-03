package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionBriefInfo.*;
import org.sorapointa.proto.ReunionBriefInfo;

public class ReunionDailyRefreshNotify {
    @Tag(tag=4) public ReunionBriefInfo reunionBriefInfo = null;
}
