package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerOfferingData.*;
import org.sorapointa.proto.PlayerOfferingData;

public class PlayerOfferingDataNotify {
    @Tag(tag=2) public List<PlayerOfferingData> offeringDataList = new ArrayList<>();
}
