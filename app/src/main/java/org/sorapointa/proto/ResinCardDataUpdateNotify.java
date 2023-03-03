package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResinCardData.*;
import org.sorapointa.proto.ResinCardData;

public class ResinCardDataUpdateNotify {
    @Tag(tag=6) public Integer todayStartTime = null;
    @Tag(tag=2) public List<ResinCardData> cardDataList = new ArrayList<>();
}
