package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CommonPlayerTipsNotify {
    @Tag(tag=3) public Integer notifyType = null;
    @Tag(tag=9) public List<String> textMapIdList = new ArrayList<>();
}
