package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SegmentInfo.*;
import org.sorapointa.proto.SegmentInfo;

public class CheckSegmentCRCNotify {
    @Tag(tag=6) public List<SegmentInfo> infoList = new ArrayList<>();
}
