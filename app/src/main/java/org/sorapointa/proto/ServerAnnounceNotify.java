package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnnounceData.*;
import org.sorapointa.proto.AnnounceData;

public class ServerAnnounceNotify {
    @Tag(tag=11) public List<AnnounceData> announceDataList = new ArrayList<>();
}
