package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorktopOptionNotify {
    @Tag(tag=11) public Integer gadgetEntityId = null;
    @Tag(tag=8) public List<Integer> optionList = new ArrayList<>();
}
