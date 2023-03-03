package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionWatcherInfo.*;
import org.sorapointa.proto.ReunionWatcherInfo;

public class UpdateReunionWatcherNotify {
    @Tag(tag=3) public Integer missionId = null;
    @Tag(tag=10) public ReunionWatcherInfo watcherInfo = null;
}
