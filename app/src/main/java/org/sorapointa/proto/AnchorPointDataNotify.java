package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnchorPointData.*;
import org.sorapointa.proto.AnchorPointData;

public class AnchorPointDataNotify {
    @Tag(tag=10) public List<AnchorPointData> anchorPointList = new ArrayList<>();
    @Tag(tag=14) public Integer nextUsableTime = null;
}
