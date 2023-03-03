package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PushTipsData.*;
import org.sorapointa.proto.PushTipsData;

public class PushTipsAllDataNotify {
    @Tag(tag=4) public List<PushTipsData> pushTipsList = new ArrayList<>();
}
