package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGGameBriefData.*;
import org.sorapointa.proto.GCGGameBriefData;

public class GCGGameBriefDataNotify {
    @Tag(tag=10) public GCGGameBriefData gcgBriefData = null;
}
