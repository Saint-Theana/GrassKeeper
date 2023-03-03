package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpenBlossomCircleCampGuideNotify {
    @Tag(tag=7) public Integer refreshId = null;
    @Tag(tag=11) public List<Integer> circleCampIdList = new ArrayList<>();
}
