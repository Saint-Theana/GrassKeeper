package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SegmentCRCInfo.*;
import org.sorapointa.proto.SegmentCRCInfo;

public class CheckSegmentCRCReq {
    @Tag(tag=1) public List<SegmentCRCInfo> infoList = new ArrayList<>();
}
