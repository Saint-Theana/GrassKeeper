package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorktopInfo {
    @Tag(tag=1) public List<Integer> optionList = new ArrayList<>();
    @Tag(tag=2) public Boolean isGuestCanOperate = null;
}
